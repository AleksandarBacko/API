package day50_inheritance;

public class Teacher extends Person {
    int teacherId;

    public void tech(String topic){
        System.out.println("teacher is teaching "+topic);
    }
}