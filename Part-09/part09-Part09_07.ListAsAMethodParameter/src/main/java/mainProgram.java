
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        
        System.out.println(returnSize(names));
        
        List<String> linked = new LinkedList<>();
        linked.add("Jesus");
        linked.add("Plasencia");
        linked.add("Toledo");
        
        ListIterator<String> iterator = linked.listIterator(0);
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List list) {
        return list.size();
    }
}
