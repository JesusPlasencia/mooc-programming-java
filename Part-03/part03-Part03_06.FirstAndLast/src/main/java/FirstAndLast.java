
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            list.add(input);
        }
        
        String firstPerson = list.get(0);
        String lastPerson = list.get(list.size() - 1);
        System.out.println(firstPerson);
        System.out.println(lastPerson);
    }
}
