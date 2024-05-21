
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        // Write your program here
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) break;
            point.add(number);
        }
        point.averageAll();
        point.averagePassing();
        point.passPercentage();
        point.gradeDistribution();
    }
}
