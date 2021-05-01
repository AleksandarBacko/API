package day26_loops;

import java.util.Scanner;

public class Replitfactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int totalCount = 1;
        while (n> 0) {
            totalCount = totalCount * n;

            n--;

        }
        System.out.println(totalCount);
    }
}
