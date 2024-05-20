
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> box;

    // Objective: A parameterless constructor
    public Package() {
        this.box = new ArrayList<>();
    }
    
    // Objective: Which adds the gift passed as a parameter to the package.
    public void addGift (Gift gift) {
        this.box.add(gift);
    }
    
    // Objective: returns the total weight of the package's gifts.
    public int totalWeight () {
        int totalWgt = 0;
        for (Gift gift : box) {
            totalWgt = totalWgt + gift.getWeight();
        }
        return totalWgt;
    }
}
