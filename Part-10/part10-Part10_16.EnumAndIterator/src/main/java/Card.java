
public class Card implements Comparable {
    
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Object incoming) {
        int thisCard = this.value;
        
        Card other = (Card) incoming;
        int otherCard = other.getValue();
        if (thisCard > otherCard) return 1;
        else if (thisCard == otherCard) return this.suit.ordinal() - other.getSuit().ordinal();
        return - 1;
    }
}
