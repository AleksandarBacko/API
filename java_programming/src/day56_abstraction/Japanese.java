package day56_abstraction;

public class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("素晴らしいです");
    }
}
