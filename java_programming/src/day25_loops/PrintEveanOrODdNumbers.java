package day25_loops;

public class PrintEveanOrODdNumbers {
    public static void main(String[] args) {
//        for(int num=1;num<=100;num++){
//            if (num%2!=0){
//                System.out.println(""+ num+ " odd");
//            }else if(num%2==0){
//                System.out.println(""+ num+ " even");
//            }
//        }
//        for (int num1 = 1; num1 <= 100; num1 +=2) {
//            System.out.println("num1 = " + num1);
//        }
//
//        for (int num2 = 2; num2 <= 100; num2 +=2) {
//            System.out.println("num2 = " + num2);
//        }
            System.out.println("EVEN NUMBERS 0 - 100: ");
            for(int n = 0; n <= 100; n++) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }

            System.out.println("\nODD NUMBERS 0 - 100: ");

            for(int k = 0; k <= 100; k++) {
                if (k % 2 != 0) {
                    System.out.print(k + " ");
                }
            }
    }
}

