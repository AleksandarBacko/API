package day10_shorthand_operators;

import java.util.Scanner;

public class ReplitPracticeA {
    public static void main(String[] args) {
        int age, zipcode;
        double height,weight;
        boolean isMarried;
        long workPhoneNumber,personalPhoneNumber;
        String firstName,lastName,fullName,email,street,state,address, contacts;

        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Please enter your first name");
        firstName=scan.next();
        System.out.println("Please enter your last name");
        lastName=scan.next();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your zip code");
        zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        age=scan.nextInt();
        System.out.println("Enter your height");
        height=scan.nextDouble();
        System.out.println("Enter your weight");
        weight=scan.nextDouble();
        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();
    }
}
