
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countOfAllNumbers = 0;
        int countOfEvenNumbers = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                countOfEvenNumbers++;
            }
            sum = sum + number;
            countOfAllNumbers++;
        }
        
        double average = (double) sum / countOfAllNumbers;
        int countOfOddNumbers = countOfAllNumbers - countOfEvenNumbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countOfAllNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countOfEvenNumbers);
        System.out.println("Odd: " + countOfOddNumbers);
    }
}
