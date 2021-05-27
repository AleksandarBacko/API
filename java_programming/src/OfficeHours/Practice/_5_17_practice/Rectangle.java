package OfficeHours.Practice._5_17_practice;

public class Rectangle {
    double height;
    double width;
    double area;
    public void setDimensions(double recheight, double recWidth){
        height=recheight;
        width=recWidth;
    }
    public double getArea(){
        area=height*width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
