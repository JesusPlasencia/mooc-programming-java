
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> luggage;
    
    public Hold (int maxWgt) {
        this.maxWeight = maxWgt;
        this.luggage = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase (Suitcase suitcase) {
        int potentialWeight = 0;
        
        // Scenario: First Suitcase
        if (this.luggage.size() == 0 && this.maxWeight >= suitcase.totalWeight()) {
            this.luggage.add(suitcase);
            return;
        }
        
        // Scenario: More than one potential suitcase in the luggage
        for (Suitcase sc : this.luggage) {
            potentialWeight = potentialWeight + sc.totalWeight();
        }
        potentialWeight = potentialWeight + suitcase.totalWeight();
        
        // Scenario: Potential weight would overpass maxWeight for this luggage
        if (potentialWeight > this.maxWeight) return;
        this.luggage.add(suitcase);
    }
    
    @Override
    public String toString () {
        String formattedStr = "";
        int sizeTotalSuitcases = this.luggage.size();
        
        // Scenario: No elements in list
        if (sizeTotalSuitcases == 0) {
            return "no suitcases (0 kg)";
        }
        
        // Scenario: More than 1 element in the luggage
        String conditionalStr = sizeTotalSuitcases == 1 ? "suitcase" : "suitcases";
        int currentSuitcaseWeight = 0;
        for (Suitcase sc : this.luggage) {
            currentSuitcaseWeight = currentSuitcaseWeight + sc.totalWeight();
        }
        formattedStr = sizeTotalSuitcases + " " + conditionalStr + " (" + currentSuitcaseWeight + " kg)";
        return formattedStr;
    }
    
    public void printItems () {
        for (int p = 0; p < this.luggage.size(); p++) {
            Suitcase currSc = this.luggage.get(p);
            currSc.printItems();
        }
    }
}
