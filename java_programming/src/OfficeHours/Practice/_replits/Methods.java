package OfficeHours.Practice._replits;

import java.util.Scanner;

public class Methods {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(countLetters(in.next()));
        }

        public static String countLetters(String str) {
            int count = 0;
            String res = "";
            String tot = "";
            char one = ' ';
            for (int i = 0; i < str.length()-1 ; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count += 1;
                    one = str.charAt(i);
                }

                if (str.charAt(i) == str.charAt(str.length() - 1)) {
                    res = "" + count + "" + str.charAt(i);
                    count = 0;
                    tot += res;
                } else if (str.charAt(i) == one && str.charAt(i) != str.charAt(i + 1)) {
                    count += 1;
                    res = "" + count + "" + str.charAt(i);
                    count = 0;
                    tot += res;
                }
            }
            return tot;
        }



        }


