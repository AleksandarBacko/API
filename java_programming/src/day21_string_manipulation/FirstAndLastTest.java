package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word ="MOM";
        char first= word.charAt(0);
        char third=word.charAt(2);
        if (first==third){
            System.out.println("first letter is meaching");
        }else {
            System.out.println("letter is meaching");
        }

        String friend="aziza";
        char firstLetter=friend.charAt(0);
        char lastLetter = friend.charAt(friend.length()-1);// da bi dobili zadnje slovo stringa moramo da uradimo -1 zato sto length pocinje brojanje od 1 a string od 0.
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter) {
            System.out.println(friend + "- first and last match");
        } else {
            System.out.println(friend + "- first and last mismatch");
        }
    }
}
