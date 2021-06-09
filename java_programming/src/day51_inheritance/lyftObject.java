package day51_inheritance;

public class lyftObject {
    public static void main(String[] args) {
        Lyft l1=new Lyft();
        l1.price=312;
        System.out.println("l1.calculateRate(32) = " + l1.calculateRate(32));
        LyftXL l2=new LyftXL();
        System.out.println("l2.calculateRate(32) = " + l2.calculateRate(32));
        Lux l3=new Lux();
        System.out.println("l3.calculateRate(32) = " + l3.calculateRate(32));

    }
}
