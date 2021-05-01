package day08_casting_scanner;

public class CastingExample {
    public static void main(String[] args) {
        byte   n1 = 10;
        short  n2 = n1;
        int n3= n1;
        int n4= 1000;
        long n5 = n4;
        float n6 = 124.4f;
        double n7 = n6;
        int n8=3456;
        double  n9=n8;
        System.out.println(n8);//3456
        System.out.println("n9 = "+n9);//3456.0

        int n10=(int)n5;
        short n11=(short)n5;
        double n13=55.3;
        float n14= (float) n13;
        System.out.println("n13 = " + n13);
        System.out.println("n14 = " + n14);

        double  n15=1234.5;// kada prevodimo decimalne u cele brojeve celi broj izlazi bez decimale
        int n16=(int)n15;
        System.out.println("n15 = " + n15);
        System.out.println("n16 = " + n16);

        int n17=200;
        byte n18= (byte)n17;
        System.out.println(n18);

        char letter= 'A';//ascii
        int letter2=letter;// letter je broj is ascii tabele u ovom slucaju prevodi "A" u 65 po tabeli
        System.out.println("letter = " + letter);
        System.out.println("letter2 = " + letter2);
    }
}
