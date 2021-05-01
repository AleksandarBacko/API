package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoours/weak :");
        int hours= scan.nextInt();
        System.out.println("Hourly rate is :");
        int hourlyRate = 40;
        int week = scan.nextInt() * hourlyRate;
        System.out.println("Weakly rate is :");
        System.out.println(week);
        int mounthly = (week* 52)/12;
        System.out.println("Mounthly rate is :");
        System.out.println(mounthly);
        int yearly = mounthly * 12;
        System.out.println("Yearly rate is :");
        System.out.println(yearly);
    }
}
