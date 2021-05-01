package day17_ternary_nested_condition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 9;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Elgible for free 2 day shipping");
        } else {
            if (itemPrice > 25) {
                System.out.println("Elgible for free regular shiping");
            } else if (itemPrice < 25 && itemPrice > 10) {
                System.out.println("10 days shiping ");
            } else {
                System.out.println("your packege is going to late as usually");
            }
        }
    }
}
