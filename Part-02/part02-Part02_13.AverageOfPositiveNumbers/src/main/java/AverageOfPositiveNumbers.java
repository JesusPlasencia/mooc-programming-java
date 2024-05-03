
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfPositiveNumbers = 0;
        int countOfPositiveNumbers = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                countOfPositiveNumbers ++;
                sumOfPositiveNumbers += number;
            }
        }
        
        if (countOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sumOfPositiveNumbers / countOfPositiveNumbers;
            System.out.println(average);
        }
    }
}
