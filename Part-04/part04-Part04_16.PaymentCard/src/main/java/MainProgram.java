
public class MainProgram {

    public static void main(String[] args) {
        // Create Paul's card
        // Create Matt's card
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        // Paul eats heartily & Matt eats affordably
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        // Print cards
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        // Paul tops up 20 euros
        paulsCard.addMoney(20.00);
        // Matt eats heartily
        mattsCard.eatHeartily();
        // Print cards
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        // Paul eats affordably
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        // Matt tops up 50 euros
        mattsCard.addMoney(50.00);
        // Print cards
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
