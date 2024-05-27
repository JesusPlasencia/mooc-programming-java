
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> inputs = new ArrayList();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        // Streams part of Collection
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        // printing out the statistics
        System.out.println("average of the numbers: " + average);
    }
}
