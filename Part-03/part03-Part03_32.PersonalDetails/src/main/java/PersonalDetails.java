
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestLength = Integer.MIN_VALUE;
        String longestName = "";
        int sumOfBirthYear = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            
            String[] arrayOfWord = input.split(",");
            String name = arrayOfWord[0];
            int birthYear = Integer.valueOf(arrayOfWord[1]);
            
            int lengthName = name.length();
            if (longestLength < lengthName) {
                longestLength = lengthName;
                longestName = name;
            }
            sumOfBirthYear = sumOfBirthYear + birthYear;
            count++;
        }
        
        double avgBirthYear = (1.0) * sumOfBirthYear / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgBirthYear);
    }
}
