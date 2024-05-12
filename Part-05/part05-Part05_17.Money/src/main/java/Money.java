
public class Money {

    // Make final a variable when you want immutable variables
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus (Money addition) {
        Money newMoney = new Money (this.euros() + addition.euros(), this.cents() + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan (Money compared) {
        int currentCents = this.euros * 100 + this.cents;
        int comparedCents = compared.euros() * 100 + compared.cents();
        if (currentCents < comparedCents) return true;
        return false;
    }
    
    public Money minus (Money decreaser) {
        int currentCents = this.euros * 100 + this.cents;
        int decreasedCents = decreaser.euros() * 100 + decreaser.cents();
        
        if (decreasedCents >= currentCents ) return new Money (0, 0);
        
        int diffCents = currentCents - decreasedCents;
        int newEuros = (int) Math.floor(diffCents / 100);
        int newCents = diffCents % 100;
        
        return new Money(newEuros, newCents);
    }
}
