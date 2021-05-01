package day22_string_manipulation;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                int num = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter name:");
                String name = scan.nextLine();

                System.out.println(num);
                System.out.println(name);

    }
}
