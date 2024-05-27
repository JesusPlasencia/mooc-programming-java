
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        int sum = values.stream().reduce(0, (prev, curr) -> prev + curr);
        System.out.println("Sum: " + sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String word = words.stream().reduce("", (prev, curr) -> prev + curr + "\n");
        System.out.println(word);
        
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(-17);
//        numbers.add(-5);
//        numbers.add(7);
//
//        ArrayList<Integer> divisible = divisible(numbers);
//
//        divisible.stream()
//                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0 || n % 3 == 0 || n % 5 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

}
