package OfficeHours.Practice._5_25_oractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1, 23, 3, 33, 1, 323, 22, 23));
        System.out.println( removeDup(list1));
    }

//    This method will take an ArrayList of numbers and remove any duplicates values.The method will return an ArrayList
//    of unique elements.
//    @param nums-The given java.util.ArrayList of numbers
//    @return -ArrayList of numbers
//    Ex: Input: {1, 3, 5, 1, 4, 5, 9};
//    Output: {3, 4, 9};


    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        ArrayList<Integer> uniques=new ArrayList<>();
        String checked="";
        for(int i=0; i < list.size(); i++) {
            int count = 0;

            if(!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    uniques.add(list.get(i));
                }

                checked += list.get(i) + " ";

            }

        }

        return uniques;
    }

    public static ArrayList<Integer> removeDup2(ArrayList<Integer> list){
        list.removeIf(e -> Collections.frequency(list,e)>1);
        return list;
    }
}
