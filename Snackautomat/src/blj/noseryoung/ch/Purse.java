package blj.noseryoung.ch;

import java.util.Scanner;

public class Purse {
    private int balance;
    private final int MAX_BALANCE = 100;
    private Scanner scanner = new Scanner(System.in);

    public Purse() {
        balance = MAX_BALANCE;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deductMoney(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void refillPurse() {
        if (balance == MAX_BALANCE) {
            System.out.println("You already achieved the max Balance of 100 CHF..");
        } else {
            balance = MAX_BALANCE;
            System.out.println("Your Balance was set to " + MAX_BALANCE + " CHF.");
        }
    }
}
