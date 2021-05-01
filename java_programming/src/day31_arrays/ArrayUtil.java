package day31_arrays;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

            int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
            //print all nums in same line
            System.out.println(Arrays.toString(nums));

            //sort nums. re-arrange values in ascending order
            Arrays.sort(nums);
            //print after sorting
            System.out.println(Arrays.toString(nums));

            System.out.println("min value: " + nums[0]);
            System.out.println("max value: " + nums[nums.length - 1]);

            //Arrays.sort(nums, Collections.reverseOrder());

            String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
            System.out.println(Arrays.toString(words));
        }
    }

