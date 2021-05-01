package OfficeHours.Practice._4_12;

import java.util.Arrays;

public class EvenArray {
    public static void main(String[] args) {
//        Write a program that can count the even and odd number from an array of integers
//        Use for each to make it easier
//
//        Ex:
//        Input: [4,1,3,12,5]
//        Output:
//        Even: 2
//        Odd: 3

        int [] nums = {4,1,3,12,5};
        int even = 0;
        int odd = 0;
        // String even += num + " " split by space -> String []
        for(int eachNum : nums) {
            if(eachNum % 2 == 0){  // checks odd: eachNum % 2 != 0 or eachNum % 2 == 1
                even++;
            } else {
                odd++;
            }
        }

        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        /*
                i -> keep track of the indexes in your nums array
                e -> keep track of the indexes in our evenNumbers array
                o -> keep tracks of the indexes in our oddNumbers array
         */

        for(int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenNumbers[e++] = nums[i]; // 1
            } else {
                oddNumbers[o++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }
}
