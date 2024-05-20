
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.jokeManager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printMenu();
            String cmd = scanner.nextLine();

            if (cmd.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToAdd = scanner.nextLine();
                jokeManager.addJoke(jokeToAdd);
            } else if (cmd.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeManager.drawJoke());
            } else if (cmd.equals("3")) {
                System.out.println("Printing jokes:");
                jokeManager.printJokes();
            } else if (cmd.equals("X")) {
                break;
            } else {
                System.out.println("Unknown command");
            }

        }
    }

    private void printMenu() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

}
