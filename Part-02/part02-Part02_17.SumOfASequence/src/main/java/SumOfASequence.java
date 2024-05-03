
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int endNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        for (int startNumber = 1; startNumber <= endNumber; startNumber++) {
            sum += startNumber;
        }
        
        System.out.println("The sum is " + sum);
    }
}
