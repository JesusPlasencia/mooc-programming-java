
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) break;
            
            double number = Math.pow(Integer.valueOf(line), 3);
            //int numberPower3 = number * number * number;
            System.out.println(Math.round(number));
        }
    }
}
