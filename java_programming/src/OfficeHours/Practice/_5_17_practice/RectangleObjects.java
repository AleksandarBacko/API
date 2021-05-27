package OfficeHours.Practice._5_17_practice;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.setDimensions(5,3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());

        Rectangle rectangle1=new Rectangle();
        System.out.println(rectangle1.getArea());
        rectangle1=rectangle;
        System.out.println(rectangle.getArea());
        rectangle1.setDimensions(33,32);
        System.out.println(rectangle.getArea());

    }
}
