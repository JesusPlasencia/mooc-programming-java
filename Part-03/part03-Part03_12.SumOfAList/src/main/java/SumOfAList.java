
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int sum = 0;
        for (int number: list) {
            sum = sum + number;
        }
        System.out.println("Sum: " + sum);
    }
}
