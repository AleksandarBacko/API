package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while(count>=0){
            System.out.println(count);
            count--;
            Thread.sleep(1000);
        }


        int unreadSMS =10;
        System.out.println("You are reading \uD83D\uDC8C number : " + unreadSMS);
        while (unreadSMS>=1){
            System.out.println("mesage read : "+unreadSMS);
            unreadSMS--;
            Thread.sleep(1000);

        }
        System.out.println("no more \uD83D\uDC8C");
    }
}
