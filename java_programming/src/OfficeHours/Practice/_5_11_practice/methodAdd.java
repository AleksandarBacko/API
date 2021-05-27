package OfficeHours.Practice._5_11_practice;

import java.util.Arrays;
import java.util.Scanner;

public class methodAdd {
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int size=r.length+1;
        int[] ar3=new int[size];
        ar3[ar3.length-1]=n;
        for(int i=0;i<ar3.length-1;i++){
            ar3[i]=r[i];
        }
        System.out.print(Arrays.toString(ar3));





    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);



    }
}

