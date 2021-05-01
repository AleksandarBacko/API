package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars=cars   +2;
        System.out.println("cars = " + cars);
        cars+= 5;
        System.out.println("cars = " + cars);
        cars-=6;
        System.out.println("cars = " + cars);

        cars-= 1;
        System.out.println("cars = " + cars);

        int electricCars=13;
        cars+= electricCars;
        System.out.println("electricCars = " + electricCars);
        System.out.println("cars = " + cars);

        String ward="java";
        System.out.println("ward = " + ward);
        ward+=" programing";
        System.out.println("ward = " + ward);
        ward+=" is fun !!!";
        System.out.println("ward = " + ward);
        String selenium = " but selenium is more fun!";
        ward+=selenium;
        System.out.println("ward = " + ward);
        char letter = 'A';
        letter +=3;
        letter+='q';
        System.out.println(letter);


    }
}
