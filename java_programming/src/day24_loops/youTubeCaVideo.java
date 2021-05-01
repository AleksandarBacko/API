package day24_loops;

public class youTubeCaVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Lets watch: World's smallest cat - BBC");
        int seconds = 0;
        while (seconds <= 117) {
            if(seconds==60) {
                System.out.println("you are on first min keep watching!\uD83D\uDC31-BBC");
                seconds++;
            }else{System.out.println("Watching \uD83D\uDC31 YouTube video: " + seconds);
            seconds++;
            Thread.sleep(1000);//kod za usporavanje koda da bi pokazivao sekundu po sekundu
                //pokazuje gresku na sleep onda mi stavimo mis na sleep i izaberemo prvu stvar da skinemo error
                //1000 is milisecunds sto znaci za 1 sekundu usporiti
        }


        }
        System.out.println("Finished watching Cat video, lets start another one");
    }
}
