package day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        
        list1.add(5);
        list1.add(213);
        list1.add(13213);
        System.out.println("list1.size() = " + list1.size());
        System.out.println(list1.get(2));

        list1.remove(1);
        System.out.println(list1);

    }
}
