package day08_casting_scanner;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner java=new Scanner(System.in);
        System.out.println("What is your name:");
        String yourName= java.next();
        System.out.println("What is up  "+yourName);
        String answer= java.next();

        Scanner java2=new Scanner(System.in);
        System.out.println("How old are you?:");
        int howOld= java2.nextInt();
        System.out.println("Is it true that you are "+howOld+" years old?!?!?!?");

        boolean confirming2=java.nextBoolean();
        boolean confirming= true;











    }
}
