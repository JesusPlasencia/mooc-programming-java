
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        // Write your program here
        String userName = scanner.nextLine();
        
        //Printing the name in 'Hi Name'
        System.out.println("Hi " + userName);
    }
}
