
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String inputUser = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String inputPass = scanner.nextLine();
        
        boolean isAuth = (inputUser.equals("alex") && inputPass.equals("sunshine")) || (inputUser.equals("emma") && inputPass.equals("haskell"));
        
        if (isAuth) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
