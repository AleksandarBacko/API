package day54_abstraction;

public abstract class MyAbstractClass {
    int num=55;
    public void learn(){
        System.out.println("learning abstract");
    }
public abstract void method1();
}

class YourClass extends MyAbstractClass{
    @Override
    public void method1() {
        System.out.println("close");
    }
}
class MyObjects{
    public static void main(String[] args) {
        YourClass yourClass=new YourClass();
        yourClass.learn();
        System.out.println(yourClass.num);
        yourClass.method1();
    }
}
