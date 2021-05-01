package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType = "Movable";
        Short numberOfRooms = 3;
        Short numberOfBathrooms= 2;
        int numberOfKitchen = 1;
        boolean basement= false;
        boolean attic=false;
        boolean pool=false;
        boolean sale= true;
        double price= 630000.99;
        String address="400 Auhay dr";
        int zipCode= 93110;
        boolean park= false;
        short schoolAround= 3;
        System.out.println("House type is:\t\t\t\t"+ houseType);
        System.out.println("Number of rooms:\t\t\t\t"+ numberOfRooms);
        System.out.println("Number of bathrooms:\t\t\t"+ numberOfBathrooms);
        System.out.println("Number of kitchen:\t\t\t\t"+numberOfKitchen);
        System.out.println("Does it have a basement:\t"+ basement);
        System.out.println("Does it have a attic:\t\t"+attic);
        System.out.println("Does it have a pool:\t\t"+pool);
        System.out.println("Is it for sale:\t\t\t\t"+sale);
        System.out.println("What i the price:\t\t\t"+price+"$");
        System.out.println("What is the address:\t\t"+address);
        System.out.println("What is the zip code:\t\t"+zipCode);
        System.out.println("Is it nex to the park area:\t"+park);
        System.out.println("How many schools is in area:\t"+schoolAround);
    }
}
