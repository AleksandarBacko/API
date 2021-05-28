package day19_class__vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCod= "sRb";
        if (countryCod.equals(countryCod.toUpperCase())){
            System.out.println("case correct");

        }else {
            System.out.println("case incorrect");
        }
    }
}
