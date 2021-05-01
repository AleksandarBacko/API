package day24_loops;

import java.util.Scanner;

public class CountUndil {
    public static void main(String[] args) throws InterruptedException {
        int count,number;
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();
        count=1;
        while(count<=number){
            System.out.println(""+count+" of "+number);
            count++;
            if (count==number/2){
                System.out.println("you are on half count of");
            }
            if(count==number/4){
                System.out.println("first quoter finish".toUpperCase());
            }else if(count==number/4*3){
                System.out.println("you are in last quoter ");
            }
            Thread.sleep(1000);
        }
        System.out.println("no more count");
    }
}
