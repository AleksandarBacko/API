package day50_inheritance;

public class teacherPerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="aca";
        p1.age=26;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherId = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();

    }
}