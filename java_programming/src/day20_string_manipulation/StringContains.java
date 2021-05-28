package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.contains("v"));//true
        System.out.println(word.contains("va"));//true
        System.out.println(word.contains("ja"));//true
        System.out.println(word.contains("a"));//true
        System.out.println(word.contains("jv"));//false
        System.out.println(word.contains("Ja"));//false

        String ror = "dmasmd dokasokdiajsod dkapskdjiasjdps adisp adps";
        /////////////////////////kdi
        System.out.println(ror.contains("kdi"));//true

        String etsyTitle = "wooden spoon | Etsy";
        //check if " | " is in etsyTitle
        if (etsyTitle.contains(" | ")) {
            System.out.println("pass - title check failed");
        } else {
            System.out.println("fail - title check filed");
        }
        String firstName = "Aleksandar";
        if (firstName.contains("Al") && firstName.contains("dr")) {
            System.out.println("both Al and dr contains");
        }else{
            System.out.println("no contains");
        }
        String email = "beshir.hasanov@gmail.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("This is a correct email - " + email);
        } else {
            System.out.println("This is not a correct email - " + email);
        }



    }
}
