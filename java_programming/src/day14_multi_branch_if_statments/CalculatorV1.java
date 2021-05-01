package day14_multi_branch_if_statments;

import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String scan2;
        System.out.println("enter operation numbers");
        double num1= scan.nextDouble();
        scan2= scan.next();
        double num2=scan.nextDouble();

        if (scan2.equals("-")){
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        }else if(scan2.equals("+")){
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        }else if(scan2.equals("/")){
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }else if(scan2.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }else {
            System.out.println("wrong enter");
        }
    }
}
