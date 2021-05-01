package day_18_conditionpractice_string;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN= 1234;
        int pinCode=2400;

        int last4exp = 1234;
        int pinExp =2222;

        if (last4SSN == last4exp && pinCode == pinExp){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if (last4SSN != last4exp && pinCode == pinExp){
                System.out.println("ssn wrong");
            }else if (last4SSN == last4exp && pinCode != pinExp){
                System.out.println("pin wrong");
            }else {
                System.out.println("both ssn and pin wrong");
            }
            System.out.println("please try again!");
        }


    }
}
