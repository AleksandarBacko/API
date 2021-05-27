package day45_oop;

public class Trafic {
    String color;
    public void showColor(){

        System.out.println("currrent color= "+color);
    }

    public void changeColor(String newcolor){
        System.out.println("change color to = "+newcolor);
        color=newcolor;
    }
}
