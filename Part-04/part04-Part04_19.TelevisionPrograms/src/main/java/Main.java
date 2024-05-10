import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String showTitle = scanner.nextLine();
            if (showTitle.isEmpty()) break;
            
            System.out.println("Duration: ");
            int showDuration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(showTitle, showDuration));
        }
        
        System.out.println("Program's maximum duration? ");
        int durationLimit = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= durationLimit) {
                System.out.println(program.toString());
            }
        }
    }
}
