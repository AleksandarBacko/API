package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Speed limit is : ");
        int speedl=scan.nextInt();
        System.out.println("Your speed is : ");
        int currnt=scan.nextInt();
        System.out.println("Your speed is "+(currnt-speedl)+" over limit SLOW DOWN !!!!");
    }
}
