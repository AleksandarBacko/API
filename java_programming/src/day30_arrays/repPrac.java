package day30_arrays;

import java.util.Scanner;

public class repPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        int big = 0;
        String bigs = "";
        for (int i = 0; i < words.length-1; i++) {

            if (words[i].length() > big) {
                big = words[i].length();
                bigs = words[i];
            }
            System.out.println(bigs);

        }

    }
}
