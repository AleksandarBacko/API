package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFormList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));

        System.out.println(getUniqueIntiges(nums));

    }

    public static List<Integer> getUniqueIntiges(List<Integer> nums) {
        List<Integer> unique=new ArrayList<>();
        int count=0;
        for (Integer each : nums){
            count= Collections.frequency(nums,each);
            if (count>1){
                continue;

            }else {
//                System.out.println(each);
                unique.add(each);
            }
        }
        return unique;
    }
}
