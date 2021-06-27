package day56_abstraction.Navigation;

public class Tesla extends Transportation implements SelfDrivable{
    @Override
    public void goingByitSelf() {
        System.out.println("Tesla is in SelfDrivingMode");
    }

    @Override
    public void hasSeats(int num) {


    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void cost(int mile) {

    }
}
