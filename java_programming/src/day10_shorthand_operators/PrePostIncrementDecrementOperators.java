package day10_shorthand_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1=1;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1);

        int num2=5;
        num2--;
        --num2;
        System.out.println("num2 = " + num2);

        int n1=10;
        int n2=++n1;//u ovom slucaju n2 se povacva za jedan +n1
        System.out.println("n1 = " + n1);//i posle davanja velicine za n2 ->n1 pstaje 11 zbog (++)
        System.out.println("n2 = " + n2);


        int n3=10;
        int n4=n3++;// u ovom slucaju n4 postaje 10 jer mu se ne dodaju (++)
        System.out.println("n3 = " + n3);//i u ovom slucaju n3 postaje 11 jer mu se dodaju(++)
        System.out.println("n4 = " + n4);

        System.out.println((n3++));
        System.out.println(n3);

        int a=5;
        int b=4;
        int c =a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
