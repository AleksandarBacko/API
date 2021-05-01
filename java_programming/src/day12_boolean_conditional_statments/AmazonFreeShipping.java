package day12_boolean_conditional_statments;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice= scan.nextDouble();
        if(totalPrice >= 25){
            System.out.println("FREE SHIPPING ELIGIBLE.YOur order total: $"+totalPrice);
        }else{
            System.out.println("FREE SHIPPING IS NOT ELIGIBLE.YOur order total is less than: $"+totalPrice+ " what is less than minimum");
        }

    }
}
