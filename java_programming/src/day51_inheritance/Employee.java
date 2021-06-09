package day51_inheritance;

public class Employee {
    String jobTitle;
    public double calculateSalary(double hourlyRate){
        double annualSalary = 2080 *hourlyRate ;
        annualSalary+=annualSalary/10;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

}
