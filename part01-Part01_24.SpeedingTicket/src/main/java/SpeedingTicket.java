
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed:");
        int inputSpeed = Integer.valueOf(scanner.nextLine());
        if (inputSpeed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
