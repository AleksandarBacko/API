package OfficeHours.Practice._replits;

import java.util.Arrays;
import java.util.Scanner;

public class AgainFourtWenty {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));
    }


    public static int[] do_switch(int[] i) {

        for(int j =0;j<i.length/2;j++){
            int temp=i[j];
            i[j]=i[i.length-1-j];
            i[i.length-1-j]=temp;
        }
        return i;


    }
}
