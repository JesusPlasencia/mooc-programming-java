
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int inputPoints = Integer.valueOf(scan.nextLine());
        
        System.out.print("Grade: ");
        if (inputPoints < 0) {
            System.out.println("impossible!");
        } else if (inputPoints < 50) {
            System.out.println("failed");
        } else if (inputPoints < 60) {
            System.out.println("1");
        } else if (inputPoints < 70) {
            System.out.println("2");
        } else if (inputPoints < 80) {
            System.out.println("3");
        } else if (inputPoints < 90) {
            System.out.println("4");
        } else if (inputPoints <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
        
    }
}
