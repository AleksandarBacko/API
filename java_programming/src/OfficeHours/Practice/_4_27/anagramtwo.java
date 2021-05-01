package OfficeHours.Practice._4_27;

import java.util.Scanner;

public class anagramtwo {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length()!=word2.length()){
            return false;
        }
        int count=0;
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        int[]arr=new int[26];
        for(int i =0;i<word1.length();i++){
            char letterfromone=word1.charAt(i);
            char letterFromtwo=word2.charAt(i);
            arr[letterfromone-97]=arr[letterfromone-97]+1;
            arr[letterFromtwo-97]=arr[letterFromtwo-97]-1;
            for(int j =0;j<arr.length;j++) {
                if(arr[j]!=0){
                    return false;
                }
            }


        }
        return true;

    }







    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}

