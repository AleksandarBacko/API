package day26_loops;

public class Multiplicaton {
    public static void main(String[] args) {
        int number=3;
        if(number<1||number>10){
            System.out.println("error:invalid input");

        }else {

            int score;
            for (int i = 1; i <= 10; i++) {
                score = i * number;
                System.out.println(i + " * " + number + " =" + score);
            }
        }
    }
}
