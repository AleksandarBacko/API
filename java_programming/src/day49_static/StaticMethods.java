package day49_static;

public class StaticMethods {

    int num =10;
    static int count=5;


    public static void displayMessage(String message){
        System.out.println("mesage: "+message);
//        System.out.println("num = " + num);//ovo je error zato sto num je instatnce variable
        System.out.println("num ="+ count);

    }

    public static void anotherStaticMethod(){
        System.out.println("anather static method");
        displayMessage("wooden spoon");
    }

    public void noStaticMethod(int num){
        this.num=num;
        System.out.println("num "+num);
        displayMessage("wooden spoon again");
    }
}
