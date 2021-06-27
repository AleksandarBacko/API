package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        Greeting gt=new MountainLanguage();
        gt.bye();
        gt.hi();

        Japanese jp=new Japanese();
        jp.bye();
        jp.hi();


    }
}
