package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {

        System.out.println("Hello From Real main method");
        main(10);
        System.out.println(Arrays.toString(args));
        //    ^^^^^^^          https://cdn.discordapp.com/attachments/805882390974169171/833071492656005130/x.gif
    }

    /**
     overloading main method:
     same name + different parameter
     JDK does not look for this one to run
     */
    public static void main(int num) {
        System.out.println("num = " + num);
    }

    public static void main(boolean b) {
        System.out.println("b = " + b);
    }
}
