package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT OF CENTS :\t");
        int cents= scan.nextInt();
        int dollars=cents /100;
        int remaining= cents % 100;
        System.out.println("dollars = " + dollars);
        System.out.println("cents = " + cents);
        System.out.println("remaining = " + remaining);
        System.out.println("IN "+cents+" cents :"+dollars+" dollars "+remaining+" cents");


    }
}
