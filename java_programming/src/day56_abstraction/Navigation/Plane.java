package day56_abstraction.Navigation;

public class Plane extends Transportation implements SelfDrivable{
    @Override
    public void goingByitSelf() {
        System.out.println("Plane is in SelfDrivingMode");
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
