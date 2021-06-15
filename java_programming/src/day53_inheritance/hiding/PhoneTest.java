package day53_inheritance.hiding;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();

        Mobile mobile=new Mobile();
        mobile.call();
        mobile.text();
    }
}
