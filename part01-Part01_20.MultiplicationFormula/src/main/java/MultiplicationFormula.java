
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        //Product
        int product = firstNumber * secondNumber;
        
        //Printing
        System.out.printf("%d * %d = %d", firstNumber, secondNumber, product);
        
    }
}
