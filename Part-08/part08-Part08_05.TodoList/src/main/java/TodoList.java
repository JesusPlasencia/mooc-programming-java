
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<String>();
    }
    
    public void add (String word) {
        if (contains(word)) {
            return;
        }
        
        this.list.add(word);
    }
    
    public boolean contains (String word) {
        return this.list.contains(word);
    }
    
    public void print () {
        int counter = 1;
        for (String item: this.list) {
            System.out.println(counter + ": " + item);
            counter++;
        }
    }
    
    public void remove (int number) {
        if (this.list.isEmpty()) return;
        this.list.remove(number - 1); 
    }
    
}
