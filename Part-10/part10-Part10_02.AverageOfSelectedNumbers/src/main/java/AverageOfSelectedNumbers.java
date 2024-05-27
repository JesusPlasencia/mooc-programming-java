import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> inputs = new ArrayList();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        
        System.out.println("");
    
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        if (Objects.equals(option, "n")) {
            double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(n -> n < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        else if (Objects.equals(option, "p")) {
            double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(n -> n >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else {
            System.out.println("Unknown command");
        }
    }
}
