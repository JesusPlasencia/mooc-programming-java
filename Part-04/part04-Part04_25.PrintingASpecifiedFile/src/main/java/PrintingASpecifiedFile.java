import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        try (Scanner readScanner = new Scanner(Paths.get(fileName))) {
            while (readScanner.hasNext()) {
                String row = readScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
