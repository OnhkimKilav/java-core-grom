package Lesson8.accounts;

/**
 * Created by Valik on 15.02.2018.
 */
public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    void depositMoney(int amount) {
        moneyAmount += amount;
    }

    //overloading
    void depositMoney() {
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }

    void changeOwnerName(String newOwnerName) {
        ownerName = newOwnerName;
    }
}
