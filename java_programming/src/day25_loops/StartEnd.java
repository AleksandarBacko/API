package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the start");
        int start = scan.nextInt();
        System.out.println("Enter the end");
        int end = scan.nextInt();
        if(start>end){
            System.out.println("Reverse numbering is not supported");
        }

        for(int i =start; i <=end; i++){
            System.out.println(i+" ");

        }
    }
}
