package day13_conditional_statments;

import java.util.Scanner;

public class SaimThired {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        int number1= number%2;
        int number3= number%3;
        int number5=number%5;
        boolean num2=number1<1;
        boolean num3=number3<1;
        boolean num5=number5<1;

        if (number1>=1){
            System.out.println(number+"is divisible by 2: "+num2);
        }else {
            System.out.println(number + "is divisible by 2: " + num2);
        }
        if (number3>=1){
            System.out.println(number+"is divisible by 3: "+num3);
        }else{System.out.println(number+"is divisible by 3: "+num3);
        }
        if (number5>=1){
            System.out.println(number+"is divisible by 5: "+num5);
        }else {System.out.println(number+"is divisible by 5: "+num5);
        }
    }
}
