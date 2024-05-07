
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String inputWord = scanner.nextLine();
            if (inputWord.equals("")) break;
            String[] splittedWord = inputWord.split(" ");
            for (String word : splittedWord) {
                System.out.println(word);
            }
        }
    }
}
