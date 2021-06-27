package day57_abstraction_polymorphisam.polymorfisam;

public class Horse extends Animal implements OscarImpresion{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("njiiiiii ");
    }

    @Override
    public void impression() {

    }
}
