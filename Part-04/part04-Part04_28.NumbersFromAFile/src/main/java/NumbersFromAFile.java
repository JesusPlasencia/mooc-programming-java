
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        boolean isFileNameValid = file.equals("numbers-1.txt") || file.equals("numbers-2.txt");
        
        if (!isFileNameValid) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNext()) {
                int numberInFile = Integer.valueOf(scannerFile.nextLine());
                if (upperBound >= numberInFile && numberInFile >= lowerBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception err) {
            err.printStackTrace();
        }
        
    }

}
