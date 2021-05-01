package day26_loops;

import java.util.Scanner;

public class Replitkoko {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        String name;
        String guestList = "";
        String moreG;

        do {
            System.out.println("Please enter guest name:");
            name = input.next();
            System.out.println("Do you want to enter new guest name:");
            moreG = input.next();
            guestList = guestList + (name + ", ");

        } while (moreG.equals("yes"));
        System.out.println(guestList);
    }

}
