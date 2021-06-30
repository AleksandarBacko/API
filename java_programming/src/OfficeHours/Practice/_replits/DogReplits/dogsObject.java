package OfficeHours.Practice._replits.DogReplits;

import java.util.Scanner;

public class dogsObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog dog = new Dog(in.next(), in.nextInt(), in.next());
        Dog dog2 = new Dog(in.next(), in.nextInt(), in.next());
        dog.getAgeInHumanYears();

        dog2.getAgeInHumanYears();
        System.out.println(dog);
        System.out.println(dog.equals(dog2));
    }
}
