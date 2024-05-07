
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        String nameOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String[] arrayOfWord = input.split(",");
            int agePerLine = Integer.valueOf(arrayOfWord[1]);
            if (oldest <= agePerLine) {
                oldest = agePerLine;
                nameOldest = arrayOfWord[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
