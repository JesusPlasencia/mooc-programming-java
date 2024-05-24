
import java.util.ArrayList;

public class Box implements Packable {
    
    private double maximumCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }

    public void add (Packable pack) {
        // Box empty and the first item surpass the max capacity
        if (this.items.isEmpty() && pack.weight() > this.maximumCapacity) return;
        
        // Box contain items, but the potential weight will surpass the max capacity
        double currWeight = weight();
        double potential = currWeight + pack.weight();
        if (potential > this.maximumCapacity) return;
        
        this.items.add(pack);
    }
    
    @Override
    public double weight() {
        if (this.items.isEmpty()) return 0.00;
        
        double currWeight = 0.00;
        for (Packable pack : this.items) {
            currWeight = currWeight + pack.weight();
        }
        return currWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }

    @Override
    public double maxCapacity() {
        return this.maximumCapacity;
    }
    
}
