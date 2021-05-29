package day48_constructors_static;

public class BusObject {
    public static void main(String[] args) {
        Bus ikarbus=new Bus();
        ikarbus.driver=new Driver("ikarbus");
        ikarbus.cylinder=new Engine(6);
        System.out.println(ikarbus.toString());
    }
}
