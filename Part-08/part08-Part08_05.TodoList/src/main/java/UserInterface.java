
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface (TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
 
    public void start () {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.println("Task: ");
                String word = scanner.nextLine();

                this.list.add(word);
            }
            else if (command.equals("list")) {
                this.list.print();
            }
            else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int taskNo = Integer.valueOf(scanner.nextLine());
                this.list.remove(taskNo);
            }
            else {
                System.out.println("Unknown command");
            }
            
        }
    }
    
}
