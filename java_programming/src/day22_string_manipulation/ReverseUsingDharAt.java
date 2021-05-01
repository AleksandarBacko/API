package day22_string_manipulation;

public class ReverseUsingDharAt {
    public static void main(String[] args) {
        String word = "Anna";///palindrom name je kad ase cita u levo i desno isto
        System.out.print(word.charAt(word.length()-1));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(0));
        System.out.println(
                ""+word.charAt(3)+
                        word.charAt(2)
                        +word.charAt(1)
                        +word.charAt(0));
        String word2 =""+word.charAt(3)+
                word.charAt(2)
                +word.charAt(1)
                +word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);
        if (word.equalsIgnoreCase(word2)){
            System.out.println("Palindrome word");
        }else {
            System.out.println("Not palindrome word");
        }
    }
}
