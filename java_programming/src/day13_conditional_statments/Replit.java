package day13_conditional_statments;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {



            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();

            //your code here
            if(a.equals("a")){
                System.out.println(a+" is wrong");
            }
            if(a.equals("b")){
                System.out.println(a+" is correct");
            }
            if(a.equals("c")){
                System.out.println(a+" is wrong");
            }
            if(a.equals("z")){
                System.out.println(a+" is not a valid answer");
            }
            if(a.equals("j")){
                System.out.println(a+" is not a valid answer");
            }
            else { System.out.println("wrong enter !!!");
            }





    }
}
