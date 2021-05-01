package day36_methods_with_return;

import java.util.Random;

public class Info {
//    public static void main(String[] args) {
//        System.out.println("Person: - "+fullName()+"\nMarried status: - "+isMarried()+"\nAge: - "+getAge());
//    }
//    public static String fullName(){
//        return "Aleksandar Backovic";
//    }
//    public static boolean isMarried(){
//        return true;
//    }
//    public static int getAge(){
//        return 26;
//    }
//}
public static void main(String[] args) {
    System.out.println(fullName()+"\nMarried status: - "+isMarried()+"\nAge: - "+getAge());
    System.out.println(getRandomYear());
}
    public static String fullName(){
        System.out.print("Full name: - ");
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 26;
    }
    public static int getRandomYear(){
        Random random=new Random();
        int num=random.nextInt(2021);
        return num;
    }
}
