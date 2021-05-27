package day46_encaptulation;

public class DealerShip {
    public static void main(String[] args) {
        Car toyota=new Car();
        System.out.println(toyota.toString());
        toyota.setMilage(2312321);
        toyota.setModel("Camry");
        toyota.setYear(2001);
        System.out.println(toyota);
        System.out.println(toyota.getMilage());


    }
}
