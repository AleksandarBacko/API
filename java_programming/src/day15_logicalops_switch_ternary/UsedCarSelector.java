package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget=5000.0;
        String model="Toyota";
        double carPrice= 4500.0;
        if (carPrice<=budget && model.equals("Toyota")){
            System.out.println("Ready to buy model: "+model+" price is "+carPrice);
        }else {
            System.out.println("I am not going to buy it");
        }

    }
}
