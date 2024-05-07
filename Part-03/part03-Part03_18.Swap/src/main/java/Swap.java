import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        for (int number: array) {
            System.out.println(number);
        }
        System.out.println("");

        // Swap
        System.out.println("Give two indices to swap:");
        int indexOne = Integer.valueOf(scanner.nextLine());
        int indexTwo = Integer.valueOf(scanner.nextLine());
        
        int helper = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = helper;

        System.out.println("");
        for (int number: array) {
            System.out.println(number);
        }
    }
}
