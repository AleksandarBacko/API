package day49_static;

public class BankAccount {
    public static double balance=500;
    public String user;

    public static void rase(double amount){
        balance+=amount;
    }
    public static void spend(double amount){
        balance-=amount;
    }
    public static void showBalance(){
        System.out.println(balance);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "user='" + user + '\'' + balance+
                '}';
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }
}
