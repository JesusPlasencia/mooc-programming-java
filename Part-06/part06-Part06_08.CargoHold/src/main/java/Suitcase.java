
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase (int maxWeight) {
        this.items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem (Item item) {
        int potentialWeight = 0;
        
        // Scenario: First Item
        if (this.items.size() == 0 && this.maxWeight >= item.getWeight()) {
            this.items.add(item);
            return;
        }
        
        // Scenario: More than one potential item in the list
        for (Item element : this.items) {
            potentialWeight = potentialWeight + element.getWeight();
        }
        potentialWeight = potentialWeight + item.getWeight();
        
        if (potentialWeight > this.maxWeight) return;
        this.items.add(item);
        
    }

    @Override
    public String toString() {
        
        String formattedStr = "";
        int sizeTotalItems = this.items.size();
        
        // Scenario: No elements in list
        if (sizeTotalItems == 0) {
            return "no items (0 kg)";
        }
        
        // Scenario: 1 element in list
        String conditionStr = sizeTotalItems == 1 ? "item" : "items";
        int currentItemWeight = 0;
        for (Item item : this.items) {
            currentItemWeight = currentItemWeight + item.getWeight();
        }
        formattedStr = sizeTotalItems + " " + conditionStr + " (" + currentItemWeight + " kg)"; 
        
        return formattedStr;
    }
    
    public void printItems () {
        String output = "";
        for (int i = 0; i < this.items.size(); i++) {
            Item currItem = this.items.get(i);
            String currName = currItem.getName();
            int currWgt = currItem.getWeight(); 
            String line = currName + " (" + currWgt + " kg)";
            System.out.println(line);
        }
    }
    
    public int totalWeight () {
        int totalWgt = 0;
        for (Item item : this.items) {
            totalWgt = totalWgt + item.getWeight();
        }
        return totalWgt;
    }
    
    public Item heaviestItem () {
        if (this.items.size() == 0) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
