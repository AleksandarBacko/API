package day24_loops;

import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number");
        int secN=scan.nextInt();
        int gues;
        do {
            System.out.println("Guess the number");
            gues= scan.nextInt();
            if (gues>secN){
                System.out.println("wrong,your number is to large");
            }else if (gues<secN) {
                System.out.println("wrong,your number is to small");
            }

        }while (gues!=secN);
        System.out.println("Guess is write ");
    }
}
