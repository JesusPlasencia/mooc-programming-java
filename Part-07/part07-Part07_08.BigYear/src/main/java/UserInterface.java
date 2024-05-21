
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            String cmd = scanner.nextLine();

            if (cmd.equals("Quit")) {
                break;
            }
            else if (cmd.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();
                this.birds.add(new Bird(name, latin));
            } else if (cmd.equals("Observation")) {
                System.out.println("Bird? ");
                String birdName = scanner.nextLine();
                if (this.birds.size() == 0) {
                    System.out.println("No birds available");
                } else {
                    boolean isBirdInList = false;

                    for (Bird bird : birds) {
                        if (bird.getName().equals(birdName)) {
                            isBirdInList = true;
                            bird.setObservationCounter();
                        }
                    }

                    if (!isBirdInList) {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (cmd.equals("All")) {
                if (this.birds.size() == 0) {
                    System.out.println("No birds available");
                } else {
                    for (Bird bird : birds) {
                        System.out.println(bird.getName() + " (" + bird.getLatin()+ "): " + bird.getObservationCounter() + " observations");
                    }
                }
            } else if (cmd.equals("One")) {
                System.out.println("Bird? ");
                String searchBird = scanner.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(searchBird)) {
                        System.out.println(bird.getName() + " (" + bird.getLatin() + "): " + bird.getObservationCounter() + " observations");
                        break;
                    }
                }
            }
        }
    }

}
