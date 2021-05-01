package day09_scanner_practice;
import java.util.Scanner;

public class MilesKilometersConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double miles,km;
        System.out.println("######Converter######\n\n");
        System.out.print("ENTER MILES : \t\t");
        miles= scan.nextDouble();
        System.out.println("\n\n");
        km =miles*1.609;
        System.out.println(miles +" miles"+ " in kilometers is "+km);




    }
}
