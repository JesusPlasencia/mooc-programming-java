import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack () {
        this.stack = new ArrayList<String>();
    }
    
    // Objective: returns a boolean-type value (true or false) that tells whether or not the stack is empty
    public boolean isEmpty() {
        return this.stack.size() == 0;
    }
    
    // Objective: Adds the value given as a parameter to the top of the stack.
    public void add (String value) {
        this.stack.add(value);
    }
    
    // Objective: returns the values ​​contained in the stack as a list.
    public ArrayList<String> values () {
        return this.stack;
    }
    
    // Objective: returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    public String take () {
        int stackLength = this.stack.size();
        if (stackLength == 0) return "";
        String top = this.stack.get(stackLength - 1);
        this.stack.remove(stackLength - 1);
        return top;
    }
    
}
