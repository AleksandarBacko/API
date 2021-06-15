package day53_inheritance.hiding;

public class Parent {
    public String name="parent> Mike Smith";
    public void intraduce1(){
        System.out.println("Hello I am "+name);
    }
}

class Child extends Parent{
    public String name="child> Bob Smith";
    public void intraduce2(){
        System.out.println("Hello I am "+name);
    }
}

class Runner{
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.intraduce1();
        Child child=new Child();
        child.intraduce1();
        child.intraduce2();
    }
}