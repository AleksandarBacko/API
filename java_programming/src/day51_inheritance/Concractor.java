package day51_inheritance;

public class Concractor extends Employee{



    @Override
    public double calculateSalary(double hourlyRate) {
        double annualSalary = hourlyRate*40*50;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Concractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
