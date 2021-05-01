package OfficeHours.Practice._4_13;

import java.util.Arrays;

public class zombieda {
    public static void main(String[] args) {
        int inhabitants[] = {10, 5, 0, 0, 4, 7, 6, 2};
        int day = 0;
        int sum = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        while (true) {
            for (int i = 1; i < inhabitants.length-1; i++) {
                sum = 0;
                if (inhabitants[i] == 0) {
                    if (inhabitants[i - 1] > 0) {
                        inhabitants[i - 1] /= 2;
                    }
                    if (inhabitants[i + 1] > 0) {
                        inhabitants[i + 1] /= 2;
                        i++;
                    }
                }
                if(i == inhabitants.length-2){
                    if(inhabitants[inhabitants.length-1] == 0){
                        System.out.println(true);
                        inhabitants[inhabitants.length-2] /= 2;
                    }
                }
            }
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int each : inhabitants) {
                sum += each;
            }
            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}

