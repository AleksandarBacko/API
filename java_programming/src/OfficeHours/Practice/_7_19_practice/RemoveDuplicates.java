package OfficeHours.Practice._7_19_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /** Create a method that will accept a String and returns a String with the duplicate instances of characters removed

     Ex:
     Input: "AAABBBCCCD"
     Output: ABCD */

    public static void main(String[] args) {
        String letters="AAABBBCCCD";
        String retLett="";
        Set<String> set=new HashSet<>(Arrays.asList(letters.split("")));
        System.out.println("set = " + set);
        System.out.println(retLett = String.join("", set));
    }

}
