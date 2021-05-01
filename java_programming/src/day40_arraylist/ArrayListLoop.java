package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        System.out.println(nums);
        nums.add(23);
        nums.add(23);
        nums.add(22);
        nums.add(23);
        nums.add(1);
        nums.add(23);
        nums.add(23);
        nums.add(321);
        nums.add(23);
        nums.add(23);
        nums.add(3);
        nums.add(23);
        System.out.println(nums);
        nums.remove(new Integer(321));// ako ocemo da sklonimo 23 mora da ide u lup i da skinemo sve 23 is Arraya
        System.out.println(nums);
        for (int i = 0; i < nums.size()-1; i++) {
            System.out.println(nums.get(i)+" ");

        }
        for (int each:nums){
            System.out.println(each+ " ");
        }
        System.out.println(nums);




    }
}
