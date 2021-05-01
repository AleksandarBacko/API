package day21_string_manipulation;

public class FirstLoop {
    public static void main(String[] args) {

        long l = 100;
        double d = 13.444;
        int whole = d < 20 ? 20 : 10;

        String name = "Jimmy";
        boolean check;
        if (name == "James") {
            check = false;
        } else {
            check = true;
        }
        int rom = 132;
        String s = "";
        s += rom;
        System.out.println(s);
        s="500";
        System.out.println(s);
        int a = 10;
        a= --a + a++ + a-- + a++;
        System.out.println(a);
        a=a+a--;
        System.out.println("a = " + a);
    }
}
