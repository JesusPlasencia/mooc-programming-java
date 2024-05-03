
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int startNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int endNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int i = startNumber; i <= endNumber; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
