package day32_Array_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
//        String sentence="java is fun";
//        String[]senspl=sentence.split(" ");
//        System.out.println(Arrays.toString(senspl));
//
//        String words = "bengal cat tabby cat persian cat no cat here ";
//        String [] cats = words.split("cat");
//        System.out.println(cats.length-1);
        String catTypes = "bengal cat tabby cat persian cat no cat here some other cat type";
        String[] catsArray = catTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length - 1));

        for(String type : catsArray) {
            System.out.println(type);
        }
        /** int count = 0;
         for(int i = 0; i < cats.length() - 2; i++) {
         if(cats.substring(i, i +3).equals("cat")) {
         count++;
         }
         }
         System.out.println("count of cats = " + count);
         */

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String [] arrz=zones.split(",");
        System.out.println("number of (,) : "+ (arrz.length-1));
        System.out.println("number of zones : "+ (arrz.length));
        System.out.println("zones in us :"+ Arrays.toString(arrz));

    }
}
