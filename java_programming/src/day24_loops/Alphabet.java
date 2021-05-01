package day24_loops;

public class Alphabet {
    public static void main(String[] args) throws InterruptedException {
        char letter ='a';
        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);
        while(letter<='z'){
            System.out.println(letter);
            letter++;
        }
        System.out.println("last letter in alphabet ");
        while (letter >= 'a'){
            System.out.println("letter: " + letter + " ");
            letter--;

            Thread.sleep(100);
        }
    }
}
