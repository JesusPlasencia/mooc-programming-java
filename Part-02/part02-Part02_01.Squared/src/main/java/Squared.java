
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int squaredNumber = number * number;
        
        System.out.println(squaredNumber);
        
    }
}
