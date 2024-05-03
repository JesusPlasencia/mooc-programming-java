
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Load of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) break;
            numbers.add(number);
        }
        
        // Establishing Boundaries (Start and End)
        System.out.println("From where?");
        int startIndex = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int endIndex = Integer.valueOf(scanner.nextLine());
        
        // Showing Results
        for (int i = startIndex; i <= endIndex; i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }
    }
}
