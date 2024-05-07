
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        // 1. Creation of Accounts
        Account matthewAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        // 2. Withdraws
        matthewAccount.withdrawal(100.0);
        // 3. Deposits
        myAccount.deposit(100.0);
        // 4. Print accounts
        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
