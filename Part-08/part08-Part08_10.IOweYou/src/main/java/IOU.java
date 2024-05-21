
import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> book;
    
    public IOU () {
        this.book = new HashMap<>();
    }
    
    public void setSum (String toWhom, double amount) {
        if (!this.book.containsKey(toWhom)) {
            this.book.put(toWhom, 0.00);
        }
        
        double currDebt = this.book.get(toWhom);
        double newDebt = currDebt + amount;
        this.book.put(toWhom, newDebt);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.book.getOrDefault(toWhom, 0.00);
    }
    
}
