package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner age =new Scanner(System.in);
        System.out.println("How old are you?");
        int n1= age.nextInt();//kada ukucamo 26 to znaci da int n1 = 26; tjs asing the value
        System.out.println(n1+" That is great age!");
        //age.close(); ako ocemo da iskljucimo skener

    }
}
