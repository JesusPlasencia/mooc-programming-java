
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            // Break if input is -1
            if (input == -1) break;
            // In case is not -1, will be pushed into the list
            list.add(input);
        }
        
        System.out.println("");
        // Sum using ForEach
        int sumValueInList = 0;
        int countItemInList = 0;
        for (int number: list) {
            sumValueInList = sumValueInList + number;
            countItemInList = countItemInList + 1;
        }
        double average = (1.0) * sumValueInList / countItemInList; 
        System.out.println("Average: " + average);
    }
}
