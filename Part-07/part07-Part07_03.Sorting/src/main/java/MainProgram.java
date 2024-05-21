
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //        int[] numbers = {-1, 6, 9, 8, 12};
        //        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        //        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        //        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        //        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        //        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length == 0) {
            return 0;
        }
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (array.length == 0) {
            return;
        }
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length){
            int indexOfSmallest = indexOfSmallestFrom(array, index);
            swap(array, index, indexOfSmallest);
            System.out.println(Arrays.toString(array));
            index++;
        }
    }

}
