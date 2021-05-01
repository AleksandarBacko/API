package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum("sdadsa","DSadas"));
        System.out.println(sum(123,3123));
        System.out.println(sum(1231.32,3123.2));
        System.out.println(sum(22,232,23));
    }
    public static int sum  (int num1,int num2){
        return num1+num2;
    }
    public static double  sum(double num1,double num2){
        return num1 + num2;
    }
    public static int  sum(int num1,int num2,int num3){
        return num1 + num2+num3;
    }
    public static String  sum(String str,String str1){
        return str+str1;
    }
}
