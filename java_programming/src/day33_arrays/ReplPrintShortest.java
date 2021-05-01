package day33_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplPrintShortest {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        int smLen=100;
        String ne="";
        String[] sm=str.split(", ");
        for(int i =0;i<sm.length;i++) {

            if (sm[i].length() < smLen) {
                smLen = sm[i].length();

            }
        }
        for (int i =0;i<sm.length;i++){

            if(sm[i].length()==smLen){
                ne+=sm[i]+",";

            }
        }String[]nem=ne.split(",");
        Arrays.sort(nem);
        System.out.println(Arrays.toString(nem));
    }





}


