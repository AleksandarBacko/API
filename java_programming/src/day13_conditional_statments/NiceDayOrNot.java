package day13_conditional_statments;

import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        int temp;
        int isItnice;
        char sing=248;
        Scanner scan=new Scanner(System.in);
        System.out.println("What is temperature today?");
        System.out.println("Is it going to be nice day ?");
        temp= scan.nextInt();
        isItnice=70;

        if (temp>=isItnice){
            System.out.println("Temperature today is: "+ temp+"F"+sing);
            System.out.println("Lets code java !!!");
        }else {
            System.out.println("Temperature today is: "+ temp+"F"+sing);
            System.out.println("Lets stay at home and code java !");
        }
    }
}
