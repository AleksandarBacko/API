package day37_methods_overloading;

import java.util.Scanner;

public class WarmUpMethod {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        loginVoid(scan.nextLine(),scan.nextLine());

//    }
//    public static void loginVoid(String username,String password){
//        String secretUsername="cybertekStudent";
//        String secretPassword= "abc123";
//        if(username.equalsIgnoreCase(secretUsername)&&password.equals(secretPassword)) {
//            System.out.println("Login Successful, welcome cybertekStudent");
//        }else {
//            System.out.println("Incorrect username or password");
//
//        }
        Scanner scan=new Scanner(System.in);
        System.out.println(login((scan.nextLine()),scan.nextLine()));
    }
    public static boolean login(String username,String password){

        String secretUsername="cybertekStudent";
        String secretPassword= "abc123";
//        if(username.equalsIgnoreCase(secretUsername)&&password.equals(secretPassword)){
//            return true;
//        }else {
//            return false;
//        }
        return (username.equalsIgnoreCase(secretUsername)&&password.equals(secretPassword));
    }
}
