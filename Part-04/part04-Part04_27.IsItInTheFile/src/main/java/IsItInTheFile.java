
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean isFileNameValid = file.equals("names.txt") || file.equals("other-names.txt");
        
        if (!isFileNameValid) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        // Store all names from file
        ArrayList<String> listOfNamesInFile = new ArrayList<String>();
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNext()) {
                listOfNamesInFile.add(scanFile.nextLine());
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        
        // Ask if name is in List
        boolean isNameInList = listOfNamesInFile.contains(searchedFor);
        if (isNameInList) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
