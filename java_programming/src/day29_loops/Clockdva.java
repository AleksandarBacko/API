package day29_loops;

public class Clockdva {
    public static void main(String[] args) throws InterruptedException {
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {

                for (int secunds = 0; secunds <= 59; secunds++) {

                    Thread.sleep(1000);
                    System.out.println(hours+" : "+minutes+" : "+secunds);
                }
            }
        }

    }
}
