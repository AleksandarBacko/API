package day49_static;

public class StaticTest {
    int nume=10;
   static String word="java";


    public static void main(String[] args) {
        StaticMethods.displayMessage("hello world");


        StaticMethods noviInstanceMetod = new StaticMethods();
        noviInstanceMetod.noStaticMethod(22);


        System.out.println(word);

    }

}
