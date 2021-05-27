package OfficeHours.Practice._5_3;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNUMBERSofList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("123","54","24"));
        ArrayList<Integer> list1=new ArrayList<>();
        Integer sum=0;
        for (String each : list){
            sum=0;

            for (int i =0;i<each.length();i++){
                sum+=Integer.parseInt(each.charAt(i)+"");

            }
            list1.add(sum);
        }
        System.out.println(list1);
    }
}
