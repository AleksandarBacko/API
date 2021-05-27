package OfficeHours.Practice._5_11_practice;

import java.util.ArrayList;

public class nanukReplits {
    public static void main(String[] args) {

    }
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
        int foodFound=0;

        for(String each: r){
            if(each.equals("nanuk")){
                way_stones--;
            }else {
                foodFound+=Integer.parseInt(each);
            }
        }
        return way_stones>=0&& foodFound>=boast;
    }
}
