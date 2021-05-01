package day25_loops;

import java.util.Scanner;

public class Replitsdasd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String str = scan.next();
//        if (str.indexOf("bread") != str.lastIndexOf("bread")&&str.length()>=11){
//            String breadIndex = str.substring(str.indexOf("bread") + "bread".length(), str.lastIndexOf("bread"));
//            System.out.println(breadIndex);
//        }else{
//            System.out.println("nothing");
//        }
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");

            if (str.substring(firstBread + 5).contains("bread")) {//znaci ako od 5 do kraja contain bread
                int secundBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread+5,secundBread));


            }else{
                System.out.println("nothing");
            }
        }else{
            System.out.println("nothing");
        }

    }
}


