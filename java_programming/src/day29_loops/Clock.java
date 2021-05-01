package day29_loops;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        int secunds = 0;
        int minutes = 0;
        int hours = 0;
        for (int i = 1; i <= 1440; i++) {
            for (int j = 1; j <= 60; j++) {
                secunds = j;
                System.out.println(secunds + " s");
                Thread.sleep(1000);

                if (secunds % 60 == 0) {
                    minutes += 1;
                    System.out.println(minutes + " =======>minutes");
                }}if (minutes % 60 == 0) {
                hours += 1;
                System.out.println(hours + " =======>hours");
            }
            }

            }
        }
//        5 minuta po 60 sekundi
//          for(int minutes = 1; minutes <= 5; minutes++) {
//                  System.out.println("\nminutes = " + minutes);
//                  for(int seconds = 1; seconds <= 60; seconds++) {
//                  System.out.print(seconds+" ");
//                  }
//                  }
//                  }
//                  }



