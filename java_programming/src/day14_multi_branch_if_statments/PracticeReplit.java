package day14_multi_branch_if_statments;

import java.util.Scanner;

public class PracticeReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screen = scan.nextDouble();
        double price = 0;

        System.out.println("Select CPU type:");
        String cpu = scan.next();

        System.out.println("Select RAM size:");
        int ram = scan.nextInt();

        System.out.println("Select storage type:");
        String storage = scan.next();

        System.out.println("Enter memory size:");
        int memory = scan.nextInt();

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();

        if (screen == 13.3) {
            price = price + 200;
        }
        if (screen == 15.0) {
            price += 300;
        }
        if (screen == 17.3) {
            price += 400;
        }

        if (cpu.equals("i3")) {
            price = price + 150;
        }
        if (cpu.equals("i5")) {
            price += 250;
        }
        if (cpu.equals("i7")) {
            price += 350;
        }

        if (ram == 4) {
            price = price + 50;
        }
        if (ram > 4) {
            price = price + (ram / 4) * 50;
        }

        if (storage.equals("HDD")) {
            price = price + (memory / 500) * 50;
        }
        if (storage.equals("SSD")) {
            price = price + (memory / 500) * 100;
        }

        if (resolution.equals("FULLHD")) {
            price = price + 100;
        }
        if (resolution.equals("4K")) {
            price = price + 200;
        }
        System.out.println("Laptop price is: $ " + price);
    }
}



