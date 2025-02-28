package ch.noseryoung.blj;

public class Purse {
    private final int MAX_BALANCE = 100;
    private int balance = MAX_BALANCE;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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