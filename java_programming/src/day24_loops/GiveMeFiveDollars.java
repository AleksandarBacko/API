package day24_loops;

import java.util.Scanner;

public class GiveMeFiveDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount");
        int dollar = input.nextInt();

        while (dollar !=5){
            System.out.println("Give me 5 dollars");
            dollar = input.nextInt();
        }
        System.out.println("Thank you for 5 dollars");




    }
}
