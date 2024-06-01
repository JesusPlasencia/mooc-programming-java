
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        // Implementation of the Locked object named String
//        Locker<String> string = new Locker<>();
//        string.setValue(":)");
//
//        System.out.println("This is a locker of type Locker implementation String -> " + string.getValue());
//
//        // Implementation of the Locked object named Integer
//        Locker<Integer> integer = new Locker<>();
//        integer.setValue(5);
//
//        System.out.println("This is a locker of type Locker implementation Integer -> " + integer.getValue());
//
//        // Implementation of the Locked object named Random
//        Locker<Random> random = new Locker<>();
//        random.setValue(new Random());
//
//        System.out.println("This is a locker of type Locker implementation Random -> " + random.getValue().nextDouble());

        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }
}
