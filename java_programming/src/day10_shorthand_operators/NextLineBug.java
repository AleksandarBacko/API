package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What mounth you paying:");
        scan.nextLine();/////ovo dodajemo da bi resili problem pomenut dole
        double rent= scan.nextDouble();
        scan.nextLine();/////ovo dodajemo da bi resili problem pomenut dole
        String mounth= scan.nextLine();//kada dodamo line svaki put kada pritisnemo enter on preskoci liniju i to je bug
        System.out.println("rent = " + rent);
        System.out.println("mounth = " + mounth);

    }
}
