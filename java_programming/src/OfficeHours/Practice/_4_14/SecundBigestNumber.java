package OfficeHours.Practice._4_14;

public class SecundBigestNumber {
    public static void main(String[] args) {
//        [IQ] Second Biggest Number
//        Given an Array of numbers. Find and print the 2nd biggest number. Note the 2nd
//        biggest should be unique meaning it should be different from the max number
//        Example:
//        Input:
//[4,3,1,4,5,2,4,8,4,8]
//        Output:
//        5
        int[] nums ={9,3,1,4,5,2,4,8,4,8};
        int max=0;
        int secund=0;
        for (int each:nums){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        for (int each:nums) {
            if (each < max && each > secund) {
                secund = each;
            }
        }
        System.out.println(secund);

    } /////////////////////////// moj kod radi !

}
//        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 5, 8};
//        int max = nums[0];        // 8
//        int secondMax = nums[0];  // 7
//
//        for (int eachNum : nums) {
//
//            if (eachNum > max) {
//                secondMax = max;
//                max = eachNum;
//            }
//
//            if (eachNum > secondMax && eachNum < max) {
//                secondMax = eachNum;
//            }
//
//        }
//
//        System.out.println("max: " + max);
//        System.out.println("2nd max: " + secondMax);
//    }
//}///////////////////////////////// njegov kod ima bug ako je najveci broj na poziciji [0]
