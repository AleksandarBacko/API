package day04_varables_intro;

public class AmazonItem {
    public static void main(String[] args) {
        String description = "HIC wooden spoon";
        System.out.println(description);
        int ratingsCount= 181;
        System.out.println(ratingsCount);
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;
        System.out.println("--- product information---");
        System.out.println(description);
        System.out.println("*****" + ratingsCount);
        System.out.println("$" +price);
        System.out.println(seller);
        System.out.println(prime);


    }
}
