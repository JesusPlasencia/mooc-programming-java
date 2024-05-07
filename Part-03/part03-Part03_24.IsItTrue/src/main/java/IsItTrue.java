
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String input = scanner.nextLine();
        boolean isStringTrue = input.equals("true");
        
        if (isStringTrue) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
