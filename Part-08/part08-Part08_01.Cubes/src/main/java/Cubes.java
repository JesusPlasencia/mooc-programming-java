
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String cmd = scanner.nextLine();
            
            if (cmd.equals("end")) {
                break;
            }
            
            int length = Integer.valueOf(cmd);
            int volume = length * length * length;
            System.out.println(volume);
            
        }
    }
}
