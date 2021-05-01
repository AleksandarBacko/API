package day11_comperators;

public class IncrenentDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        ++i;
        i++;
        i++;
        System.out.println("i = " + i);

        int lineOfCode=15;
        System.out.println("lineOfCode = " + lineOfCode);
        lineOfCode++;
        ++lineOfCode;
        lineOfCode+=1;
        lineOfCode=lineOfCode+1;
        System.out.println("lineOfCode = " + lineOfCode);

        lineOfCode--;
        --lineOfCode;
        lineOfCode-=1;
        lineOfCode=lineOfCode-1;
        System.out.println("lineOfCode = " + lineOfCode);

        char letter= 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);

    }
}
