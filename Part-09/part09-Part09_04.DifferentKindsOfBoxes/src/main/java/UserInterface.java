import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }
    
    public void addOperation (Operation operation) {
        this.operations.add(operation);
    }
    
    public void start () {
        while (true) {
            printOperations();
            System.out.println("Choice: ");
            String choice = this.scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }
    
    private void printOperations() {
        System.out.println("Operations:");
        System.out.println("0: Stop");
        for (int i = 0; i < this.operations.size(); i++) {
            String operationName = this.operations.get(i).getName();
            System.out.println((i + 1) + ": " + operationName);
        }
    }
    
    private void executeOperation (String choice) {
        int operation = Integer.valueOf(choice);
        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(scanner);
    }
}
