package ch.noseryoung.blj;

public class Purse {
    private final int MAX_BALANCE = 100; // Maximum allowed balance in CHF.
    private int balance = MAX_BALANCE;   // Start with 100 CHF.

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        // to not drop below 0 CHF
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void refillPurse() {
        if (balance >= MAX_BALANCE) {
            System.out.println("You already have the maximum amount: " + MAX_BALANCE + " CHF.");
        } else {
            balance = MAX_BALANCE;
            System.out.println("Your purse has been refilled to " + MAX_BALANCE + " CHF.");
        }
    }
}