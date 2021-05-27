package OfficeHours.Practice._5_3;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> word  =new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));
        char targetWord='a';
        int count=0;
//        for (String each: word){
//            for(int i=0;i<each.length();i++){
//                if (each.charAt(i)==targetWord){
//                    count++;
//                }
//            }
//        }
        for (String each: word){
          count+=letterInWord(each,targetWord);
        }

        System.out.println(targetWord + " was found "+count);
    }
    public static int letterInWord(String word,char target){
        int count =0;
            for(int i=0;i<word.length();i++) {
                if (word.charAt(i) == target) {
                    count++;
                }
            }
            return count;
    }
}
