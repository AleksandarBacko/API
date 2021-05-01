package day09_scanner_practice;

import java.util.Scanner;

public class PraticeRelit {
    public static void main(String[] args) {
                //WRITE YOUR CODE HERE:

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1=scan.next();
        double tomatoes=5.5;
        System.out.println("Enter Item2 and its price:");
        String item2=scan.next();
        double chesse=3.5;
        System.out.println("Enter Item3 and its price:");
        String item3=scan.next();
        double apples=6.3;
        double totalPrice= tomatoes+chesse+apples;
        String report = "Total price: " + totalPrice ;
        System.out.println("Item1: Tomatoes Price: "+tomatoes+","+" Item2: Cheese Price: "+chesse+","+" Item3: Apples Price: "+apples);
        System.out.println(report);
    }
}




