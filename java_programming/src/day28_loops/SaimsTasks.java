package day28_loops;

import java.util.Scanner;

public class SaimsTasks {
    public static void main(String[] args) {
//        [IQ] PalindromeA word that is the same read forwards and backwards. User takes a word from
//        the console. Print true if the word is a palindrome. Print false if the word is not
//        palindrome.-> input: civic-> output: true
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");

        String word=scan.next();
        char beck='0';
        String back="";
        boolean palindrome=true;
        for (int i =0;i<=word.length()-1;i++){
            int index=word.length()-i-1;
             beck=word.charAt(index);
             back+=beck;
             if(back.equals(word)){
                 palindrome=true;
             }else {
                 palindrome=false;
             }
        }
        System.out.println(back);
        System.out.println(palindrome);
    }
}
