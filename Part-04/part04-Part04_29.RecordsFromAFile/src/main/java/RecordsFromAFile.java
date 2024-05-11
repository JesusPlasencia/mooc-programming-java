
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = input.nextLine();
        try ( Scanner scanner = new Scanner(Paths.get(fileName)) ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception err) {
            err.printStackTrace();
        }

    }
}
