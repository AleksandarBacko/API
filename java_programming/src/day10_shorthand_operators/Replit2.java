package day10_shorthand_operators;

import java.util.Scanner;

public class Replit2 {
    public static void main(String[] args) {
        int inputSecunds,hours,minutes,seconds;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter secunds:");
        inputSecunds=scan.nextInt();
        hours=inputSecunds/3600;
        minutes=inputSecunds/60/60;
        seconds=inputSecunds%60;
        System.out.println(""+hours+", "+minutes+", and "+seconds+" seconds");
    }
}
