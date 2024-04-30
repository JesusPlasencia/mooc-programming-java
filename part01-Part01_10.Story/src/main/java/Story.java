
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\nWhat is the main character called?");
        String userName = scanner.nextLine();
        System.out.println("What is their job?");
        String userJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.format("Once upon a time there was %s, who was %s.\nOn the way to work, %s reflected on life.\nPerhaps %s will not be %s forever.\n",
                userName, userJob, userName, userName, userJob);
    }
}
