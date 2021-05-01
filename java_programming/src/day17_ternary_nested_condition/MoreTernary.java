package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;

        String job= (hourlyRate>45)? "accept":"reject";
        System.out.println("job = " + job);

        boolean isEligibleToDrive = true;
        String driving=(isEligibleToDrive)? "have DL, Can drive":"No Dl, cannot drive";
        System.out.println("driving = " + driving);
    }
}
