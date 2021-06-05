package day50_inheritance;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public void walk() {
        System.out.println(name + " is walking to work");

    }
    public void talk() {
        System.out.println(name + " is talking on the phone with a client");
    }

    public void work(String job) {
        System.out.println(name + " is working 8 hours a day as an " + job);
    }
}
