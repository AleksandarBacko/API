package day49_static;

public class spending {
    public static void main(String[] args) {
        BankAccount name=new BankAccount();
        name.user="aleks";
        BankAccount.spend(23);
        System.out.println(name.toString());

        BankAccount name1=new BankAccount();
        name1.user="wife";
        BankAccount.spend(22);
        System.out.println(name1.toString());


        BankAccount.setBalance(10000);
        System.out.println(BankAccount.getBalance());
        BankAccount name2=new BankAccount();
        name2.user="wife";
        BankAccount.spend(223);
        System.out.println(name2.toString());

        BankAccount.balance=200;
        System.out.println(BankAccount.getBalance());
        BankAccount.rase(100000);
        System.out.println(BankAccount.balance +" doge coin go to the moon ");
    }
}
