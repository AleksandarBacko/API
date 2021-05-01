package day24_loops;

import java.util.Scanner;

public class PinCodedoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int valid =1234;
        int enterCode;
        do{
            System.out.println("PLEASE ENTER PIN CODE ");
            enterCode=scan.nextInt();
            if(valid!=enterCode){
                System.out.println("NOT VALID PIN CODE");
            }
        }while(valid!=enterCode);
            System.out.println("Welcome in Wells Fargo!");
    }
}
