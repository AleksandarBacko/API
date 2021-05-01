package day13_conditional_statments;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        int inputPincode;
        int secretPincode;
        System.out.println("Welcome to Wells Fargo!");
        Scanner scan=new Scanner(System.in);
        inputPincode= scan.nextInt();
        secretPincode=4567;
        if (inputPincode==secretPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance or deposit!");
        }
        else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }
        System.out.println("Thank you for using Wells Fargo !");


////        if(inputPincode>secretPincode){
//           System.out.println("Incorrect pincode! "+inputPincode);
//            System.out.println("Please try again!");
//        }
//        if(inputPincode<secretPincode){
//            System.out.println("Incorrect pincode! "+inputPincode);
//            System.out.println("Please try again!");
//        }

    }
}
