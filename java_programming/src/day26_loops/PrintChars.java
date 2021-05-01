package day26_loops;

public class PrintChars {
    public static void main(String[] args) {

//        String word="BREAK TILL (9:18 PM EST)";
//        for(int i= 0; i < word.length() ; i++){
//
//            System.out.println(word.charAt(i));
//        }
        String word="BREAK TILL (9:18 PM EST)";
        for(int i= word.length()-1 ;i>=0 ; i--){////unazad ista stvar

            System.out.println(word.charAt(i));
        }
    }
}
