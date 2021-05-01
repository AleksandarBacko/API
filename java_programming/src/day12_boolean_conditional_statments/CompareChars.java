package day12_boolean_conditional_statments;

public class CompareChars {
    public static void main(String[] args) {
        char letter1='A';
        char letter2='J';
        boolean compare=letter1>letter2;
        System.out.println(compare);
        compare=letter1==letter2;
        System.out.println(compare);
        compare=letter1<letter2;
        System.out.println(compare);

        char grade = 'E';
        boolean pass = grade <= 'C';
        System.out.println("Did you pass the exam? -"+pass);
    }
}
