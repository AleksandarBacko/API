package day57_abstraction_polymorphisam.polymorfisam;

public class Dog extends Animal{
    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("dog woof woof");
    }
}
