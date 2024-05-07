

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Implement the search functionality here
        System.out.println("Search for? ");
        int numberToFind = Integer.valueOf(scanner.nextLine());
        int index = 0;
        boolean wasNumberFound = false;
        
        while (index < array.length) {
            if (array[index] == numberToFind) {
                wasNumberFound = true;
                break;
            }
            index++;
        }
        
        if (wasNumberFound) {
            System.out.println(numberToFind + " is at index " + index + ".");
        } else {
            System.out.println(numberToFind + " was not found.");
        }
    }

}
