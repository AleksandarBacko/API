package OfficeHours.Practice._5_12_practice;

public class BankAccount {

    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin) {
        if (pin == inputPin) {
            return balance;
        }
        return -1;
    }

}
