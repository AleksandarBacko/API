package day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        System.out.println("first num :");
        int n1=scan.nextInt();
        System.out.println("secund num :");
        int n2=scan.nextInt();
        int sum =n1+n2;
        System.out.println("Total is :"+sum);
    }
}
