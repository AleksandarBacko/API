package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
buildEmail("Saim  n/a","cybertEkschool");

    }
    public static void buildEmail(String name,String domain){
        name=name.replace(" ","_").toLowerCase();
        domain=domain.toLowerCase();
        System.out.println(name+"@"+domain+".com");

    }
}
