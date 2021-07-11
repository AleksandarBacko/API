package day59_polymorphisam_exceptions;

import OfficeHours.Practice._6_8_practice.Circle;
import day57_abstraction_polymorphisam.Shape.Shape;
import day57_abstraction_polymorphisam.Shape.triangle;

public class instanceOf {
    public static void main(String[] args) {
        Shape shape=new triangle();
        System.out.println(shape instanceof triangle);

        System.out.println("shape.getClass() = " + shape.getClass().getSimpleName());
    }
}
