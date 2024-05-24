import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> quantities;
    
    public Warehouse () {
        this.products = new HashMap<>();
        this.quantities = new HashMap<>();
    }
 
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.quantities.put(product, stock);
    }
    
    public int price (String product) {
        if (!this.products.containsKey(product)) return -99;
        return this.products.get(product);
    }
    
    public int stock(String product) {
        if (!this.quantities.containsKey(product)) return 0;
        return this.quantities.get(product);
    }
    
    public boolean take(String product) {
        if (!this.quantities.containsKey(product)) return false;
        
        int stock = stock(product);
        if (stock <= 0) return false;
        int newStock = stock - 1;
        this.quantities.put(product, newStock);
        return true;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
}
