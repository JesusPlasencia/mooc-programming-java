
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int num = Integer.valueOf(input);
            if (num < 0) {
                continue;
            }
            sum = sum + num;
            count ++;
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }
    }
}
