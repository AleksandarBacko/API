package day13_conditional_statments;

public class SaimAssa {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ +   - --a    *   a--  % 2 + a;

        //-200            - (-1-199) *200=40000%2               199
        int c;
        c=a+b;
        System.out.println("c = " + c);



        a=a;

        System.out.println( a);
        System.out.println(b);


        int x = 300;
        int y  = 400;
        int z = x + y - x * y + x / y;
        // (300+400)-(300*400)+(300/400)
        System.out.println("z = " + z);
        //700   -     120000    +     0.75;
        //What is the value of x, y, and z?

        double h = 500.0;
        double j =400.0;
        double q = h / j;
        System.out.println(q);




    }
}
