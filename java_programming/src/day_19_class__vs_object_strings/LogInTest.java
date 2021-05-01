package day_19_class__vs_object_strings;

public class LogInTest {
    public static void main(String[] args) {
        String expUserName="qwerty";
        String expPassword="Abc123";
        String userName="QWERTY";
        String password="Abc123";
        if(expUserName.equalsIgnoreCase(userName)&& expPassword.equals(password)){
            System.out.println("Pass - user successfully logged in!");
        }else {
              if ( expUserName!=userName){
                  System.out.println("Incoreect Username");
              }else{
                  System.out.println("Incoreect Password");
              }

        }
    }
}
