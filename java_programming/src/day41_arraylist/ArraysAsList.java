package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);
//        nums.add(100);======================>.UnsupportedOperationException eror zato sto ne mozemo da menjamo size zbog metode asList
//        System.out.println("nums = " + nums);
//        nums.clear();======================>.UnsupportedOperationException eror zato sto ne mozemo da menjamo size zbog metode asList
//        nums.remove(0);======================>.UnsupportedOperationException eror zato sto ne mozemo da menjamo size zbog metode asList

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(23, 1, 34, 54));
        nums1.add(3213);
        System.out.println("nums1 = " + nums1);
        nums1.add(213);
        System.out.println(nums1);
        nums1.remove(0);//remove number on index 0
        nums1.remove(new Integer(34));//remove specific number


        List<String> drinks= new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "celsius", "red bull", "coke", "pepsi", "mdew", "kombucha"));
        System.out.println(drinks);



        List<String> drinks150= new ArrayList<>(Arrays.asList());
        List<String> drinks112= new ArrayList<>(Arrays.asList());
        List<String> drinks35= new ArrayList<>(Arrays.asList());
        int coffeine=0;
        for(String each : drinks) {

            if (each.equals("monster") || each.equals("red bull") || each.equals("celsius")) {
                coffeine = 150;
                System.out.println("each = " + each +" coffeine -"+coffeine);
                drinks150.add(each);
            } else if (each.equals("coffee") || each.equals("kombucha")) {
                coffeine = 112;
                System.out.println("each = " + each +" coffeine -"+coffeine);
                drinks112.add(each);
            } else if (each.equals("tea") || each.equals("coke") || each.equals("pepsi") || each.equals("mdew")) {
                coffeine = 35;
                System.out.println("each = " + each +" coffeine -"+coffeine);
                drinks35.add(each);

            }

        }
        System.out.println("drinks150 = " + drinks150);
        System.out.println("drinks112 = " + drinks112);
        System.out.println("drinks35 = " + drinks35);




        drinks.forEach(drink -> System.out.println(drink.toUpperCase()));
//        drinks.forEach(System.out::println); isto kao iznad printa ne koristimo samo sam probao


        drinks.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });





//        for(String drink:drinks)
//        {
//            switch (drink)
//            {
//                case "monster": case "redbull": case "celcius":
//                coffeine = 150;
//                break;
//                case "cofee": case "kambucha":
//                coffeine =112;
//                case "tea": case "coke": case "pepsi":
//                coffeine = 35;
//                break;
//            }
//            System.out.println(drink+ " = " + coffeine);
//        }=========================================================== ista stvar sa swich stajtmentom


    }
}
