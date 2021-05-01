package day08_casting_scanner;

import java.util.Scanner;// skenaer je vec kodiran / napravljen i u sistemu je ovako se ubacuje



public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName=scan.next();// scan.next() nam omogucava da ubacimo ime value za firstName
        System.out.println("nice to meet you, "+ firstName);
    }
}
