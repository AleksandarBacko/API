package OfficeHours.Practice._4_7_practice;

public class primeNum {
    public static void main(String[] args) {
        int number = 50;

        // 5/2, 5/3, 5/4

        for(int j = 2; j <= number; j++) {
            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                if(j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(j  + ", ");
            }

        }
    }
}
