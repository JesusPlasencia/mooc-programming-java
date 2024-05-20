
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start () {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            }
            else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String originWord = scanner.nextLine();
                
                
                String translatedWord = this.dictionary.translate(originWord);
                if (translatedWord == null) {
                    System.out.println("Word " + originWord + " was not found");
                    continue;
                }
                System.out.println("Translation: " + translatedWord);
            }
            else {
                System.out.println("Unknown command");
            }
            
        }
        System.out.println("Bye bye!");
    }
    
}
