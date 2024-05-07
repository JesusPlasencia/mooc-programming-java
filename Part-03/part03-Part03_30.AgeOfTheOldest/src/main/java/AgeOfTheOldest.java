
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = Integer.MIN_VALUE;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String[] arrayOfWord = input.split(",");
            int agePerLine = Integer.valueOf(arrayOfWord[1]);
            if (oldest <= agePerLine) {
                oldest = agePerLine;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
