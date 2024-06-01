import java.util.ArrayList;

public class Hideout <T> {

    private ArrayList<T> hideout;
    
    public Hideout () {
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout (T toHide) {
        this.hideout = new ArrayList<>();
        this.hideout.add(toHide);
    }
    
    public T takeFromHideout() {
        if (this.hideout.isEmpty()) return null;
        T element = this.hideout.get(0);
        this.hideout.remove(element);
        return element;
    }
    
    public boolean isInHideout() {
        return this.hideout.size() > 0;
    }
    
}
