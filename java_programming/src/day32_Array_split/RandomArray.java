package day32_Array_split;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {


//    [HERE YOU GO I SAW THIS TASK WHEN I WAS READING THE BOOK INTRODUCTION TO JAVA.KEEP THIS CODE IN MIND.THE SOLUTION
//        IS NOT MINE]
//        "

                Random random = new Random();
                int num[] = {1, 2, 3, 4, 5, 6};

                for (int i = 0; i < num.length; i++) {
                    int r = random.nextInt(i + 1);
                    int temp = num[i];
                    num[i] = num[r];
                    num[r] = temp;
                }
                System.out.println(Arrays.toString(num));


            }
        }


