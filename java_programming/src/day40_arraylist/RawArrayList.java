package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
        /**
         * Declaring Array list in 2 way
         * 1-     ArrayList list = new ArrayList();
         * 2-     List list2 = new ArrayList();
         */
        ArrayList list= new ArrayList();
        List list2=new ArrayList();

        //add values;
        list.add("java");
        list.add("apples");
        list.add("coffee");
        list.add(1234);
        list.add(55.2);
        list.add(true);
        list.add("wooden spoon");
        System.out.println(list);
        System.out.println(list.size());

    }
}
