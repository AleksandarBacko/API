package OfficeHours.Practice._6_8_practice;

public class Shape {
    double area;
    double perimeter;

    public void calculateArea(){
        System.out.println("Shape area");
    }

    public void calculatePerimeter(){
        System.out.println("Shape perimeter");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
