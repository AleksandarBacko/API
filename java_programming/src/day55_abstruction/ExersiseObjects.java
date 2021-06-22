package day55_abstruction;

public class ExersiseObjects {
    public static void main(String[] args) {
        Lifting lift=new Lifting();
        lift.start();
        lift.perform();
        System.out.println("lift.getCaloriesCount(30- min) = " + lift.getCaloriesCount(30));
    }
}
