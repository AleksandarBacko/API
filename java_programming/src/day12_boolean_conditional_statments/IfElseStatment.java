package day12_boolean_conditional_statments;

import java.util.Scanner;

public class IfElseStatment {
    public static void main(String[] args) {


        if(10<5){
            System.out.println("10 is greater than 5 !");//condition is true
        }else{
            System.out.println("5 is smaller than 10 ");//condition is false
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your passcode");


        int pass = scan.nextInt();
        if (pass > 70){
            System.out.println("Your test passed");
        }else {
            System.out.println("Your test failed");
        }

        int  count= 25;
        if (count>30){
            System.out.println("Count is greater than 30!");//conditin false
        }else {
            System.out.println("Count is less than 30 !");//condition true
        }

        byte age= 25;
        if (age>=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is grater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("age is less than 18");
        }

    }
}
