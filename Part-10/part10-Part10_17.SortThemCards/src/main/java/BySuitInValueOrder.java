
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int ordinalOne = c1.getSuit().ordinal();
        int ordinalTwo = c2.getSuit().ordinal(); 
        if (ordinalOne != ordinalTwo) return ordinalOne - ordinalTwo;
        return c1.getValue() - c2.getValue();
    }
    
}
