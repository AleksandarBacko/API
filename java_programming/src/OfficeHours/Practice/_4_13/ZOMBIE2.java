package OfficeHours.Practice._4_13;

import java.util.Arrays;
import java.util.Scanner;

public class ZOMBIE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int sum = 0;
        int j = 0;

            System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
            sum = 0;
           while(true) {
               for (int i = 1; i < inhabitants.length - 1; i++) {
                   if (inhabitants[i] > 0) {
                       inhabitants[i] = inhabitants[i];
                       sum += inhabitants[i];
                   }
                   if (inhabitants[i]==0&&inhabitants[i + 1] != 0) {
                       inhabitants[i + 1] = inhabitants[i + 1] / 2;
                       sum += inhabitants[i];
                   } else if (inhabitants[i]==0&&inhabitants[i - 1] != 0) {
                       inhabitants[i - 1] = inhabitants[i - 1] / 2;
                       sum += inhabitants[i];
                   }
                   if (i == inhabitants.length - 2) {
                       if (inhabitants[inhabitants.length - 1] == 0) {
                           System.out.println(true);
                           inhabitants[inhabitants.length - 2] /= 2;
                       }


                   }

               }
               System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
               j++;


               if (sum == 0) ;
               System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
               System.out.println("---- EXTINCT ----");
               break;
           }
           }
        }

//wrong code !!!!!


