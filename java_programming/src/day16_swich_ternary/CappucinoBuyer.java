package day16_swich_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size="tall";
        double price;
        double calories;

        switch (size) {
            case "tall":
                price = 3.50;
                calories = 120;
                System.out.println("Size: " + size + " price " + price + " calories " + calories);
                break;
            case "grande":
                price = 3.69;
                calories = 90;
                System.out.println("Size: " + size + " price " + price + " calories " + calories);
                break;
            case "venti":
                price = 3.69;
                calories = 90;
                System.out.println("Size: " + size + " price " + price + " calories " + calories);
                break;
            default:
                System.out.println("We dont serv that coffee");
        }
    }
}
