
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics () {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count = this.count + 1;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) return 0.00;
        return (1.0) * sum() / getCount();
    }
}
