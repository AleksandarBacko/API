package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo n=new StaticBlockDemo();
        StaticBlockDemo m=new StaticBlockDemo();
        StaticBlockDemo s=new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num); //25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75
    }
}
