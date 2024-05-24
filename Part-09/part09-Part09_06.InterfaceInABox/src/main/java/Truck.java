
import java.util.ArrayList;

public class Truck implements Packable{
    
    private ArrayList<Packable> boxes;
    private double maximumCapacity;
    
    public Truck (double maximumCapacity) {
        this.boxes = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }
    
    public void add (Packable pack) {
        if (this.boxes.isEmpty() && pack.maxCapacity() > this.maximumCapacity) return;
        
        double potentialWgt = maxWeightOfBoxesInTruck() + pack.maxCapacity();
        if (potentialWgt > this.maximumCapacity) return;
        
        this.boxes.add(pack);
    }

    private double maxWeightOfBoxesInTruck () {
        if (this.boxes.isEmpty()) return 0.00;
        
        double wgt = 0.00; 
        for (Packable pack : this.boxes) {
            wgt = wgt + pack.maxCapacity();
        }
        return wgt;
    }
    
    @Override
    public double weight() {
        if (this.boxes.isEmpty()) return 0.00;
        
        double currWeight = 0.00;
        for (Packable pack : this.boxes) {
            currWeight = currWeight + pack.weight();
        }
        return currWeight;
    }

    @Override
    public String toString() {
        String read = "Truck:\n";
        
        for (Packable pack : this.boxes) {
            read = read + "\t" + pack.toString() + "\n";
        }
        
        return read;
    }

    @Override
    public double maxCapacity() {
        return this.maximumCapacity;
    }
    
}
