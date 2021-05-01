package OfficeHours.Practice._4_27;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }
//    [Anagram]
//
//    Create a method that will accept two Strings. Check if the two
//    Strings are anagram of each other. If they are anagram return true otherwise return false.
//
//    Anagram means the characters of the words are the same, but rearranged in different orders
//
//    For example:
//    listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'

    public static  boolean isAnagram(String one,String two){
        if (one.length()!=two.length()){
            return false;
        }
        one =one.toLowerCase();
        two =two.toLowerCase();
        int [] count=new int[26];
        for(int i =0;i<one.length();i++){
            char letterfromone=one.charAt(i);
            char letterFromtwo=two.charAt(i);
            count[letterfromone-97]=count[letterfromone-97]+1;
            count[letterFromtwo-97]=count[letterFromtwo-97]-1;
            System.out.println(Arrays.toString(count));
        }
        return Arrays.equals(count,new int[26]);
    }
}
