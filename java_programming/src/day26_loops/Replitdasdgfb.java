package day26_loops;

import java.util.Scanner;

public class Replitdasdgfb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        String day="Day ";
        int count=0;
        while(inhabitants!=0){
            System.out.println(day+count+"["+ inhabitants+"]");
            count++;
            inhabitants= inhabitants/2;
        }
        System.out.println("---- EXTINCT ----");


    }
}
