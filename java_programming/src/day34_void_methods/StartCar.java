package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }
    public static void seatInCar(){
        System.out.println("Unlock the door");
        System.out.println("Open the door and seat in car ");
    }
    public static void startTheCar(){
        System.out.println("Put the key in");
        System.out.println("Turn on right ");
        for (int i=0;i<5;i++){
            System.out.println("krkrkrkrkrk ");
        }
        for (int i=0;i<2;i++){
            System.out.println("paf paf paf ");
        }
        for (int i=0;i<2;i++){
            System.out.println("boom boom boom  ");
        }
    }
    public static void shiftToDrive(){
        System.out.println("Press the break");
        System.out.println(("Put shift in 'D' mode"));
    }
    public static void  pressGasPedal(){
        System.out.println("press the gas pedal and drive fastest you can :D");
    }
}
