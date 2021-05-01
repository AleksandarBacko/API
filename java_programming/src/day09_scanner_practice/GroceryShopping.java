package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("***WELCOME TO TARGET***\n");
        System.out.print("Enter price for milk :\t\t");
        double p1=scan.nextDouble();
        System.out.print("Enter price for bread :\t\t");
        double p2=scan.nextDouble();
        System.out.print("Enter price for cucomber :\t");
        double p3=scan.nextDouble();
        System.out.println("Total is : \t\t\t\t\t"+(p1+p2+p3));
        double  tax = (p1+p2+p3)*0.07;
        System.out.println("Tax : \t\t\t\t\t\t"+tax);
        double pay= 500;
        System.out.println("Pay cash :\t\t\t\t\t"+pay);
        double change= pay - (p1+p2+p3)-tax;
        System.out.println("Change is : \t\t\t\t"+change);



        if ((p1+p2+p3)>1000){
            System.out.println("You dont have money!!!");
        }
        System.out.println("***THANK YOU FOR SHOPPING!!!***");

    }
}
