package day29_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer=1;outer<=10;outer++){
            for (int iner=1;iner<=10;iner++){
                System.out.print(outer*iner+" \t");

            }
            System.out.println();
        }

    }
}
