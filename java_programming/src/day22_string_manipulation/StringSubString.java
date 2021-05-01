package day22_string_manipulation;

public class StringSubString {
    public static void main(String[] args) {
        //             0123456
        String word = "amazing";
        System.out.println(word.substring(4));//sve od 4 na desno
        System.out.println(word.substring(0,7));//printa sve zato sto je length 7
        System.out.println(word.substring(0,6));//printa do 6 znaci printa 012345===amazin
        System.out.println(word.substring(0));// printa 0 i sve na desno u pravodu celu rac

    }
}
