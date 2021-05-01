package OfficeHours.Practice;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
//        //*
//        Given three String variables of some text find and print the longest word that also contains 'a'
//
//        Ex:
//        "java"
//        "mouse"
//        "computer"
//        Output: java
//        Ex:
//        "java"
//        "mouse"
//        "apples"
//        Output: apples
//
//        Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
//
//        -----------------------------------------------------------------
//
//                Given a String message with some text and a number (1-3) replace certain characters from the String message.
//
//                When the number is:
//        1: replace 'a' with 'e'
//        2: replace 's' with 'r'
//        3: replace 'o' with 'z'
//
//
//        Ex:
//        message: java class is fun
//                number: 1
//        Output: jeve cless is fun
//
//        Ex:
//        message: java class is fun
//                number: 2
//        Output: java clarr ir fun

        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = ""; // java

        if(wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }

        if(biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with A: " + biggestWordWithA);


        }
    }
}
