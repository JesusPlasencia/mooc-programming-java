
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else {
                countOfNumbers ++;
                sumOfNumbers += number;
            }
        }
        
        if (countOfNumbers > 0) {
            double average = (double) sumOfNumbers / countOfNumbers;
            System.out.println("Average of the numbers: " + average);
        }
    }
}
