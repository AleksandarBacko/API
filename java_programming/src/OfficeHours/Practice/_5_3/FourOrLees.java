package OfficeHours.Practice._5_3;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLees {
    public static void main(String[] args) {
        ArrayList<String > list= new ArrayList<>(Arrays.asList("apple", "java", "tree", "cat","animal", "shortcut"));
        ArrayList<String> list1=new ArrayList<>();

        for (String each:list){
            if (each.length()<=4){
                list1.add(each);
            }
        }
        System.out.println(list1);
    }
}
