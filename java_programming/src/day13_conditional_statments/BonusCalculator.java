package day13_conditional_statments;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salsAmount = 2345.77;
        if (salsAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Grate job, you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your bonus for sale of " + salsAmount + "$" + " is " + bonus + "$");
    }
}
