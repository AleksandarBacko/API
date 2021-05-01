package day23_string_manipulation_while_loop;

import java.util.Scanner;

public class ReplitsPractice {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //YOUR CODE HERE

            int sada=word.length()/2;
            System.out.println(sada);

            if((word.length()%2)>0){
                System.out.println(word.charAt(word.length()/2));

            }



        }
    }

