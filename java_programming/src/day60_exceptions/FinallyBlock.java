package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("enter a number");
            int num = scan.nextInt();
            System.out.println("you entered " + num);
            System.exit(0);//will stop java complitlly
        }catch (InputMismatchException e){
            System.out.println("you entered invalid value");
        }finally {
            scan.close();//close and clean up scanner
            System.out.println("finally block runs always");

        }


    }
}
