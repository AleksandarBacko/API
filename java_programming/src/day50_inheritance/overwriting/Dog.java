package day50_inheritance.overwriting;

public class Dog extends Animal{
    public void run() {
        System.out.println("Dog is running...");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking ruff woof");
    }
}
