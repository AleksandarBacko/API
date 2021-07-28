package day61_exeption_hendeling;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int min=60;
        System.out.println("class going for "+min+" min");

        if (min>50){
            throw new BreakTimeException();
        }
        System.out.println("Lets continue the class");
    }
}
