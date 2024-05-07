import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTypes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0) break;
            list.add(number);
        }
        
        list.remove(3.00); // Deleting by Value
        list.remove(5.00); // Deleting by Value
        list.remove(2);    // Deleting by Index
        
        System.out.println("");
        for (double number: list) {
            System.out.println(number);
        }
    }
}
