
import java.util.Random;

public class Factory {
    
    public Packable produceNew () {
        Random ticket  = new Random();
        // Draws a number from the range [0, 4). The number will be 0, 1, 2, or 3.
        int number = ticket.nextInt(5);

        if (number == 0) {
            return new CD ("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (number == 1) {
            return new CD ("Wigwam", "Nuclear Nightclub", 1975);
        } else if (number == 2) {
            return new Book ("Robert Martin", "Clean Code", 1 );
        } else if (number == 3) {
            return new Book ("Kent Beck", "Test Driven Development", 0.7);
        } else {
            return new ChocolateBar();
        }
        
    }
    
}
