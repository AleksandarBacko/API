package day58_polymorphism;

public class objectBuild {
    public static void main(String[] args) {
        B b =new B();
        b.m2();
        A var1=new B();
        var1.m1();
        I var2=new B();
        var2.m2();
    }
}
