package day30_arrays;

import java.util.Scanner;

public class replits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        char str = '1';
        char lst = '2';


        for (int i = 0; i < words.length - 1; i++) {
            str = words[i].charAt(0);

            lst = words[i].charAt(words.length - 1);
        }
        System.out.println("" + str + lst);
    }
}
