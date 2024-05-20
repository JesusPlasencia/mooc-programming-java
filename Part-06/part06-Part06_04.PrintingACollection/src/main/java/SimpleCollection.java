
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString () {
        
        if (this.elements.size() == 0) return "The collection " + this.name + " is empty.";
        String output = "The collection " + this.name + " has "; 
        int counter = this.elements.size();
        if (counter == 1) output = output + "1 element:\n";
        else output = output + counter + " elements:\n";
        
        for (int i = 1; i <= this.elements.size(); i++) {
            if (i == this.elements.size()) {
                output = output + this.elements.get(i - 1);
                break;
            }
            output = output + this.elements.get(i - 1) + "\n";
        }
               
        return output;
    }
    
}
