package day45_oop;

public class CoffeeeType {
    public static void main(String[] args) {
        Coffee cco=new Coffee();
        cco.type("Americano");
        System.out.println(cco.drink(99));
        System.out.println(cco.toString());
        System.out.println(cco.amount());
        System.out.println(cco.refill());
        System.out.println(cco.amount());
        System.out.println(cco.toString());
    }
}
