package day55_abstruction.interface_demo;

public interface MyInterface {
    public abstract void learn();
}
class Myclass implements MyInterface,Myinterface2{
    @Override
    public void learn(){
        System.out.println("learning in my Class");
    }
}

interface Myinterface2{

}



class Main{
    public static void main(String[] args) {
        Myclass clas=new Myclass();
    }
}