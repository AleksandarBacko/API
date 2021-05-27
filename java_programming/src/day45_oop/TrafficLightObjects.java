package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
     Trafic light=new Trafic();
     light.showColor();
     light.changeColor("red");
        System.out.println(light.color);
    }
}
