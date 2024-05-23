
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add (double status) {
        this.changes.add(status);
    }
    
    public void clear () {
        this.changes = new ArrayList<>();
    }

    public double maxValue() {
        if (this.changes.isEmpty()) return 0.00;
        
        double max = this.changes.get(0);
        for (double change : this.changes) {
            if (change > max) {
                max = change;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.changes.isEmpty()) return 0.00;
        
        double min = this.changes.get(0);
        for (double change : this.changes) {
            if (change < min) {
                min = change;
            }
        }
        return min;
    }
    
    public double average() {
        if (this.changes.isEmpty()) return 0.00;
        
        int counter = 0;
        double sum = 0;
        for (double change: this.changes) {
            sum = sum + change;
            counter ++;
        }
        return 1.0 * sum / counter;
    }
    
    @Override
    public String toString() {
        return this.changes.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
