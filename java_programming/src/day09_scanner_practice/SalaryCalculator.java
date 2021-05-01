package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hourly rate is :");
        int hourlyRate= 40;
        int week=scan.nextInt()*hourlyRate;
        System.out.println("Weakly rate is :");
        System.out.println(week);
        int mounthly=week * 4;
        System.out.println("Mounthly rate is :");
        System.out.println(mounthly);
        int yearly=mounthly*12;
        System.out.println("Yearly rate is :");
        System.out.println(yearly);



    }
}
