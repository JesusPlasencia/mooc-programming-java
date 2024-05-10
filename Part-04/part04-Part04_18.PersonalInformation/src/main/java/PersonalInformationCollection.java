import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First name: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) break;
            
            System.out.println("Last name: ");
            String inputLast = scanner.nextLine();
            if (inputLast.isEmpty()) break;
            
            System.out.println("Identification number: ");
            String inputId = scanner.nextLine();
            if (inputId.isEmpty()) break;
            
            infoCollection.add(new PersonalInformation(inputName, inputLast, inputId));
        }
        
        for (PersonalInformation persona : infoCollection) {
            System.out.println(persona.getFirstName() + " " + persona.getLastName());
        }
    }
}
