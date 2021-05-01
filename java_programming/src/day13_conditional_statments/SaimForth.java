package day13_conditional_statments;

import java.util.Scanner;

public class SaimForth {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int age= scan.nextByte();
        if (age>=18){
            System.out.println("Eligible to vote !");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
