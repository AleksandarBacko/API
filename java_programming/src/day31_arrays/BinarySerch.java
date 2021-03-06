package day31_arrays;

import java.util.Arrays;

public class BinarySerch {
    public static void main(String[] args) {
        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); //1
        System.out.println(Arrays.binarySearch(nums, 2344));//4
        System.out.println(Arrays.binarySearch(nums, 25)); //-3
        System.out.println(Arrays.binarySearch(nums, 700)); //-5
        System.out.println(Arrays.binarySearch(nums, -5)); //0
//za surch nam treba da svi brojevi budu po redu u ostalom nece raditi i ako trazimo pogresan broj pokazace nam broj sa minusom -
        //check if number 12345 is among numbers in array
        if (Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }
    }
}
