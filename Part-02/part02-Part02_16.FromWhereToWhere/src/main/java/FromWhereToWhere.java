
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int endNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int startNumber = Integer.valueOf(scanner.nextLine());

        if (endNumber >= startNumber) {
            for (int i = startNumber; i <= endNumber; i++) {
                System.out.println(i);
            }
        }
    }
}
