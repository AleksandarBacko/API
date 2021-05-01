package day_19_class__vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String brand = "NEStorIAN";
        System.out.println(brand.startsWith("NESt"));  //true
        System.out.println(brand.startsWith("neST")); //false
        System.out.println(brand.endsWith("rIAN"));  //true
        System.out.println(brand.endsWith("rian")); //false



        String firstName="Dr.Nadir";
        if (firstName.startsWith("Mr")){
            System.out.println("man");
        }else if (firstName.startsWith("Dr")){
            System.out.println("doctor");
        }else if (firstName.startsWith("Mrs")){
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms")){
            System.out.println("Single woman");
        }else if (firstName.startsWith("Sr")){
            System.out.println("Senior");
        }else{
            System.out.println("Invalid abbreviation");
        }
        String url = "https://stackoverflow.com";

        if (url.endsWith(".com")){
            System.out.println("Commercial web");
        }else if(url.endsWith("ru")){
            System.out.println("Russian web");
        }else if(url.endsWith("gov")){
            System.out.println("Government web");
        }else if(url.endsWith("edu")){
            System.out.println("Education web");
        }else if(url.endsWith("org")){
            System.out.println("Organization web");
        }

    }
}
