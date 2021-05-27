package OfficeHours.Practice._5_11_practice;

import java.util.ArrayList;

public class SeparatePartsChellenge2 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> all = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            all.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(all);
        ArrayList<Character> digits = new ArrayList<>(all);
        ArrayList<Character> special = new ArrayList<>(all);

        // I want to remove each Char that is not a letter.
        letters.removeIf(eachChar -> !Character.isLetter(eachChar));
        digits.removeIf(eachChar -> !Character.isDigit(eachChar));
        special.removeIf(eachChar -> Character.isLetterOrDigit(eachChar));

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Specials: " + special);

    }
}
