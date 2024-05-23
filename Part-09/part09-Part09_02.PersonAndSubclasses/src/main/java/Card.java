
import java.util.Random;

public class Card extends Student {
    
    private int id;
    
    public Card(String name, String address) {
        super(name, address);
        this.id = generateId();
    }
    
    public void someBluffyMethod () {
        super.credits();
    }
    
    
    private int generateId() {
        Random random = new Random();
        int id = random.ints(1, 100000).findFirst().getAsInt();
        return id;
    }
}
