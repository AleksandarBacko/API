package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Washingtin DC");
        list.add("New york");
        list.add("Vienna");
        list.add("Adana");
        list.add("LA");
        list.add(0,"Ashgabat");

        System.out.println(list);
        System.out.println("first city = "+ list.get(0));
        System.out.println("last city = "+ list.get((list.size()-1)));

        for (String each : list) {
            System.out.println(each + ", ");
        }

        list.remove(3);
        list.remove("New york");

        System.out.println("after we remove = "+list);

        list.clear();
        System.out.println("list = " + list);

        if(list.isEmpty()){
            System.out.println("is empty");
        }

    }
}
