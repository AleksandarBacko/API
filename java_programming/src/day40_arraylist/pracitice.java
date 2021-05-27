package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class pracitice {
    public static void main(String[] args) {


        ArrayList<Integer> star=new ArrayList<>();
       star.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
       String s="";
        for (int i = 0; i < star.size(); i++) {
            if(star.get(i)>5){
                continue;
            }
            if(star.get(i)%2==0){
                s+="1";
            }else {
                s+="0";
            }
        }
        System.out.println(s);
    }
}
