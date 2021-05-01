package day35_methods_with_param;

import java.util.Scanner;

public class MultipleParams {
//    public static void main(String[] args) {
//        showSum(323.2,3213.32);
//    }
//    public static void showSum(double num1,double num2){
//        double sum=num1+num2;
//        System.out.println(sum);
//    }
//}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double d1=scan.nextDouble();
    double d2=scan.nextDouble();
    showSum(d1,d2);


}
    public static void showSum(double num1, double num2  ){
        double sum = num1 + num2;
        System.out.println("Print sum of double numbers "+sum);
    }
}