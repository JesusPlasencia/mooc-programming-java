
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) break;
            numbers.add(number);
        }
        
        //numbers.stream().filter(LimitedNumbers::isInRange).forEach(r -> System.out.println(r));
        numbers.stream().filter(n -> n >= 1 && n <= 5).forEach(r -> System.out.println(r));
    }
    
    public static boolean isInRange (int n) {
        return (n >= 1 && n <= 5);
    }
}
