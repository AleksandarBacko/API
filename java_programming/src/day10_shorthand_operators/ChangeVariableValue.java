package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count=3;
        count=count+2;
        System.out.println("count = " + count);

        int apples=2;
        apples=apples+10;
        System.out.println("apples = " + apples);
        apples += 10;
        System.out.println("apples = " + apples);



    }
}
