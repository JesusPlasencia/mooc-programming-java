
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Come Together");
        
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade illegalGrade = new Grade(22);
        // exception happens, execution will not continue from here
        System.out.println(illegalGrade.getGrade());
    
        
        System.out.println("The End");
    }

    public static int readNumber(Scanner scanner) {
        while (true) {
            System.out.println("Give a number: ");
            try {
                int readNumber = Integer.parseInt(scanner.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input was not a number.");
            }
        }
    }

    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lines;
    }

    public static List<String> readLinesShiftingResponsibility(String fileName) throws Exception {
        List<String> lines = new ArrayList<>();
        Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        return lines;
    }
}
