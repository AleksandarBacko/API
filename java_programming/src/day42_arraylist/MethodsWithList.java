package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List <String> words= new ArrayList<>(Arrays.asList("Java","is", "fun"));
        printStrList(words);
        List <Integer> nums =new ArrayList<>(Arrays.asList(2312,3123,3123,213,123,213));
        System.out.println(sumIntigerList(nums));
    }
    public static void printStrList(List<String> words) {
        for (String each : words) {
            System.out.print(each + " ");

        }
        System.out.println();
    }
    public static int sumIntigerList(List<Integer> list) {
        int sum=0;
        for (int each:list){
            sum+=each;
        }
        return sum;
    }


}
