
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private static final int NUMBER_COUNT = 7; // Assuming 7 numbers per row
    private static final int MAX_NUMBER = 40; // Assuming numbers range from 1 to 40

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
    
    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random luck = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        for (int i = 0; i < 7; i++) {
            int generated = luck.nextInt(40) + 1;
            while(containsNumber(generated) == true) {
                generated = luck.nextInt(40) + 1;
            }
            // [1 - 40]
            this.numbers.add(generated);
        }
        HashSet<Integer> drawnNumbers = new HashSet<>();
        // Finish when size of HashSet has 7 items
        while (drawnNumbers.size() < NUMBER_COUNT) {
            int number = luck.nextInt(MAX_NUMBER) + 1;
            if (!drawnNumbers.contains(number)) {
                this.numbers.add(number);
                drawnNumbers.add(number);
            }
        }
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        LotteryRow that = (LotteryRow) other;
        return this.numbers.equals(that.numbers);
    }
    
    @Override
    public int hashCode() {
        return this.numbers.hashCode();
    }
}

