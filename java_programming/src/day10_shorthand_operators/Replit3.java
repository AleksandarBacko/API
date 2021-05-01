package day10_shorthand_operators;

import java.util.Scanner;

public class Replit3 {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        String amOrPm;



        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);
    }

}
