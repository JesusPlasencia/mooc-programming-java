public class Calculator {

    private int value;

    public Calculator() {
        value = 0;
    }

    public void add(int number) {
        value = value + number;
    }

    public void subtract(int number) {
        value = value - number;
    }
    
    
    public int getValue() {
        return value;
    }
}
