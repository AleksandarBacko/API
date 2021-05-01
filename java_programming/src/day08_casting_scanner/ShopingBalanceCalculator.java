package day08_casting_scanner;

public class ShopingBalanceCalculator {
    public static void main(String[] args) {
        double  balance=345.55;
        double price1= 20.88;
        double  price2= 89.99;
        long price3= 15;
        double  remainingBalance = balance - price1 -price2 -price3;
        System.out.println("Your balance is :  "+balance);
        System.out.println("After shopping ======>  ");
        System.out.println("Your remaining balance is:  "+remainingBalance);

        remainingBalance= (int)219;// nije dobro jer izlazi sa nulom 219.0;
        int newBalance = (int)remainingBalance;//ovako treba
        System.out.println(remainingBalance);
        System.out.println(newBalance);

        float balance1=12;
        double price5= 2.88;
        double  price6= 8.99;
        long price7= 1;
        float  remainingBalance1 = balance1 - (float)price5 -(float)price6 -(float)price7;
        System.out.println("Your balance is :  "+balance1);
        System.out.println("After shopping ======>  ");
        System.out.println("Your remaining balance is:  "+remainingBalance1);

    }
}
