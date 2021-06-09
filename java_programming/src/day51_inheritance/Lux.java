package day51_inheritance;

public class Lux extends LyftXL{
    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles)*2;
    }
}
