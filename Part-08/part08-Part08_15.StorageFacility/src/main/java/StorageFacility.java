
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> containers;
    
    public StorageFacility() {
        this.containers = new HashMap<>();
    }
    
    public void add (String unit, String item) {
        this.containers.putIfAbsent(unit, new ArrayList<>());
        this.containers.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!this.containers.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.containers.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (!this.containers.containsKey(storageUnit)) {
            return;
        }
        
        ArrayList<String> items = this.containers.get(storageUnit);
        items.remove(item);
    }
    
    public ArrayList<String> storageUnits() {
         ArrayList<String> unitWithStock = new ArrayList<>();
         
         for (String item : this.containers.keySet()) {
             if (this.containers.get(item).size() > 0) {
                 unitWithStock.add(item);
             }
         }
         
         return unitWithStock;
    }
    
}
