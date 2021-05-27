package OfficeHours.Practice._5_12_practice;

public class AccountInfo {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountHolderName="James Bond";
        bankAccount.pin=1234;
        bankAccount.balance=1000000;
        bankAccount.accountNumber=21332131;
        System.out.println(bankAccount.pin);
        System.out.println(bankAccount.getBalance(1234));
        System.out.println(
        );
        System.out.println(new BankAccount().accountNumber);
        bankAccount= new BankAccount();
        System.out.println(bankAccount.accountHolderName);

    }
}
