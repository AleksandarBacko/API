package day26_loops;

import java.util.Scanner;

public class SaimsPdf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        for (int i = 1; i <= 5; i++) {
//            number1 = number;
//            number = scan.nextInt();
//            num+=number;
//            if (number > number1) {
//                System.out.println("bigest number is :" + num);
//
//            }else if (number < number1) {
//                System.out.println("smallest number is :" + number);
//
//================================= pogresno =============================================
//            }
//        }
//        int number = 0;
//        int numMax = 0;
//        int numMin = 29139922;
//        int count = 1;
//        do {
//            System.out.println("Enter the number" + count);
//            number = scan.nextInt();
//            if (number > numMax) {
//
//                numMax = number;
//            }
//            if (number < numMin) {
//
//                numMin = number;
//                count++;
//            }
//        }while (count <= 5) ;
//            System.out.println("bigest number is :" + numMax);
//            System.out.println("smolest number is :" + numMin);
        //============================dobar

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = input.nextInt();
        int max = first; // 132
        int min = first;

        for(int i=0; i < 4; i++ ) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);


    }
}






