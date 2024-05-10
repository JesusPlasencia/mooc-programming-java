
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        if (this.balance < 2.60) return;
        this.balance = this.balance - 2.60;
    }

    public void eatHeartily() {
        if (this.balance < 4.60) return;
        this.balance = this.balance - 4.60;
    }
    
    public void addMoney(double amount) {
        if (amount < 0.00) return; // Don't do anything if amount is zero
        
        this.balance = this.balance + amount;
        // Calculate if new balance surpassed 150.00
        if (this.balance >= 150.00) {
            this.balance = 150.00;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
