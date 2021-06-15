package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type ="Mobile phone";

    public static void use(){
        System.out.println("Usig mobile  Phone");
    }
    public void text(){
        use();
        System.out.println("and sending a text message");
    }
}
