package day16_swich_ternary;

public class AdairaApartmans {
    public static void main(String[] args) {
        int numberOfBedrooms=0;
        double price;

        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio bedroom apartman selected");
                price= 1749.31;
                System.out.println("Price is :"+price+"/mounth");
                break;
            case 1:
                System.out.println("One bedroom apartman selected");
                price= 2030.31;
                System.out.println("Price is :"+price+"/mounth");
                break;
            case 2:
                System.out.println("Two bedrooms apartman selected");
                price= 2749.31;
                System.out.println("Price is :"+price+"/mounth");
                break;
            default:
                System.out.println("Currently unavailable.");
        }
    }
}
