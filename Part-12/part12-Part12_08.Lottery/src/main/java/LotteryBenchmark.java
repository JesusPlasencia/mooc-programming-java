import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class LotteryBenchmark {

    private static final int NUMBER_COUNT = 7; // Assuming 100 numbers per row
    private static final int MAX_NUMBER = 40; // Assuming numbers range from 1 to 200

    // First algorithm: using ArrayList and containsNumber method
    private static void algorithmOne() {
        Random luck = new Random();
        for (int i = 0; i < 100000; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < NUMBER_COUNT; j++) {
                int generated = luck.nextInt(MAX_NUMBER) + 1;
                while (numbers.contains(generated)) {
                    generated = luck.nextInt(MAX_NUMBER) + 1;
                }
                numbers.add(generated);
            }
        }
    }

    // Second algorithm: using HashSet for uniqueness check
    private static void algorithmTwo() {
        Random luck = new Random();
        for (int i = 0; i < 100000; i++) {
            HashSet<Integer> drawnNumbers = new HashSet<>();
            ArrayList<Integer> numbers = new ArrayList<>();
            while (drawnNumbers.size() < NUMBER_COUNT) {
                int number = luck.nextInt(MAX_NUMBER) + 1;
                if (drawnNumbers.add(number)) {
                    numbers.add(number);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Measure time for algorithm one
        long startTime = System.nanoTime();
        algorithmOne();
        long endTime = System.nanoTime();
        long durationOne = endTime - startTime;
        System.out.println("Algorithm One Duration: " + durationOne + " nanoseconds");

        // Measure time for algorithm two
        startTime = System.nanoTime();
        algorithmTwo();
        endTime = System.nanoTime();
        long durationTwo = endTime - startTime;
        System.out.println("Algorithm Two Duration: " + durationTwo + " nanoseconds");
    }
}
