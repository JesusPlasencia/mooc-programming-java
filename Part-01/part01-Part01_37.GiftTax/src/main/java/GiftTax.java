
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftPrice = Double.valueOf(scan.nextLine());
        
        double taxes = 0;
        System.out.print("Tax: ");
        if (giftPrice < 5000) {
            System.out.println("No tax!");
        } else if (giftPrice < 25000) {
            taxes = 100 + (giftPrice - 5000) * 0.08;
            System.out.println(taxes);
        } else if (giftPrice < 55000) {
            taxes = 1700 + (giftPrice - 25000) * 0.10;
            System.out.println(taxes);
        } else if (giftPrice < 200000) {
            taxes = 4700 + (giftPrice - 55000) * 0.12;
            System.out.println(taxes);
        } else if (giftPrice < 1000000) {
            taxes = 22100 + (giftPrice - 200000) * 0.15;
            System.out.println(taxes);
        } else {
            taxes = 142100 + (giftPrice - 1000000) * 0.17;
            System.out.println(taxes);
        }
    }
}
