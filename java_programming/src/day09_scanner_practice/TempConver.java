package day09_scanner_practice;

import java.util.Scanner;

public class TempConver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char cells=186;
        double fah, cel;
        System.out.println("######Temp Converter######\n\n");
        System.out.print("ENTER FAHRENHEIT : \t\t");
        fah = scan.nextDouble();
        System.out.println("\n\n");
        cel = (fah - 32) * 5 / 9;
        System.out.println(fah +""+cells+ " Fahrenheit" + " in Celsius is " + cel+cells);


    }
}
