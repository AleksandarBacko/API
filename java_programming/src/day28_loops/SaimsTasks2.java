package day28_loops;

import java.util.Scanner;

public class SaimsTasks2 {
    public static void main(String[] args) {
//        Count upper, lower, and numbersGiven a String, find and print how many uppercase
//    letter, lowercase letter, and number are in the String.Ex:Input: 2juMp41EEkd4s4Output:
//    3 uppercase letters  6 lowercase letters  5numbers
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String word=scan.next();

        String num ="1234567890";
        String uppc="QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowc="qwertyuiopasdfghjklzxcvbnm";

        int numCount=0;
        int uppCount=0;
        int lowCount=0;


        for (int i =0;i<=word.length()-1;i++){

            String cha1=""+word.charAt(i);
            if (num.contains(cha1)){
                numCount+=1;

            }else if (uppc.contains(cha1)){
                uppCount+=1;

            }else if (lowc.contains(cha1)) {
                lowCount += 1;
            }

        }
        System.out.println("There is "+numCount+" numbers "+uppCount+" upp letters and "+lowCount+" low letters");
    }
}
