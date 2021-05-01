package day25_loops;

public class FizzzBuzz {
    public static void main(String[] args) {
        System.out.println("Fizz:");
        for(int t=1;t<=100;t++) {
            if (t % 3 == 0) {
                System.out.print(" " + t);
            }
        }
        System.out.println("\nBuzz:");
        for(int k=1;k<=100;k++) {
            if (k % 5 == 0) {
                System.out.print(" " + k);
            }
        }
        System.out.println("\nFizzBuzz: ");
        for(int z=1;z<=100;z++) {
            if (z % 5 == 0 && z % 3 == 0) {
                System.out.print(" "+z);
            }
        }
    }
}
