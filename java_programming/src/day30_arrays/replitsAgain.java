package day30_arrays;

import java.util.Scanner;

public class replitsAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        if (nums[nums.length - 1] < size) {
            System.out.print(0);
        } else if (nums[nums.length - 1] == size) {
            System.out.print(size);
        }

    }
}
