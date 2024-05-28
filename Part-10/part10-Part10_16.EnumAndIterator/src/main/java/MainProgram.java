
import java.util.List;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.print();
    }
}
