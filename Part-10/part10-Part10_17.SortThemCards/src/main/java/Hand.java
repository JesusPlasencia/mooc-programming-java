import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> hand;
    
    public Hand () {
        this.hand = new ArrayList<Card>();
    }
    
    public void add (Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        Collections.sort(this.hand, comparator);
    }

    public List<Card> getHand() {
        return hand;
    }
    
    @Override
    public int compareTo(Hand other) {
        int thisHandValue = this.hand.stream().map(c -> c.getValue()).reduce(0, (prev, curr) -> prev + curr);
        int otherHandValue = other.getHand().stream().map(c -> c.getValue()).reduce(0, (prev, curr) -> prev + curr);
        return thisHandValue - otherHandValue;
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
        Collections.sort(this.hand, comparator);
    }
    
}
