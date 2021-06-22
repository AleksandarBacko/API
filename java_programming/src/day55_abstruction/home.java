package day55_abstruction;

public class home {
    static int dsa;
    static {
         dsa=3;
        System.out.println("jsdnmasdjn");
    }

    public static void main(String[] args) {
        System.out.println(home.dsa);

        home.dsa=3213;
        System.out.println(home.dsa);

    }
}
