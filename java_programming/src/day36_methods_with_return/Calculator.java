package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Adding "+add(33,3));
        System.out.println("Minus "+minus(33,3));
        System.out.println("Multiply "+multiply(33,3));
        System.out.println("Divide "+divide(33,3));
    }
    public static double add(double lol,double lols){
        return lol+lols;
    }
    public static double minus(double lol,double lols){
        return lol-lols;
    }
    public static double multiply(double lol,double lols){
        return lol*lols;
    }
    public static double divide(double lol,double lols){
        return lol/lols;


    }
}
