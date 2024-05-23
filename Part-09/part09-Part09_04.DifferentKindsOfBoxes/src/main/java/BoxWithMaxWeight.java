
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (this.items.isEmpty() && item.getWeight() > this.maxWeight) return;
        
        int potentialWeight = getTotalWeight() + item.getWeight();
        if (potentialWeight > this.maxWeight) return;
        
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    private int getTotalWeight () {
        if (this.items.isEmpty()) return 0;
        int currWeight = 0;
        for (Item itm : this.items) {
            currWeight = currWeight + itm.getWeight();
        }
        return currWeight;
    }
    
}
