
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> ecosystem;
    
    public Herd () {
        this.ecosystem = new ArrayList<>();
    }
    
    public void addToHerd (Movable movable) {
        this.ecosystem.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        if (this.ecosystem.isEmpty()) return;
        
        for (Movable item : this.ecosystem) {
            item.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        if (this.ecosystem.isEmpty()) return "";
        
        String res = "";
        for (Movable item : this.ecosystem) {
            res = res + item.toString() + "\n";
        }
        return res;
    }
    
}
