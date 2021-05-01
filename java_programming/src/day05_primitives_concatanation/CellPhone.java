package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand= "APPLE";
        String model = "Iphone 8s";
        String color ="White";
        double price =400.22;
        int storage = 128;
        boolean hasCamera = true;
        System.out.println("BREND:\t" + brand);
        System.out.println("MODEL:\t" + model);
        System.out.println("COLOR:\t" + color);
        System.out.println("PRICE:\t" + price );
        System.out.println("STORAGE:\t" +storage+"GB");
        System.out.println("HASCAMERA:\t" + hasCamera);

        String carBrend = "BMW";
        String carModel = "M5";
        String carColor = "Black";
        int carPrice = 80000;
        int maxSpeed = 220;
        boolean isItTheBest = true;
        System.out.println("CAR BREND : \t\t" + carBrend+"\n" +
                "CAR MODEL:\t\t\t"+carModel+"\n" +
                "CAR COLOR :\t\t\t"+ carColor+"\n" +
                "CAR PRICE :\t\t\t"+carPrice+"$"+"\n" +
                "MAX SPEED :\t\t\t" + maxSpeed+"miles/hour"+ "\n"+
                "IS IT THE BEST? :\t"+isItTheBest );

    }
}
