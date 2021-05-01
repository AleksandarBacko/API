package OfficeHours.Practice._4_13;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[] arr=new int[num];
        for(int i= 0;i<arr.length-1;i++){
            if(i==0){
                arr[i+1]=1;
            }
            if(i>0){
                arr[i+1]=arr[i]+arr[i-1];
            }
        }System.out.println(arr[arr.length-1]+arr[arr.length-2]);





    }
}

