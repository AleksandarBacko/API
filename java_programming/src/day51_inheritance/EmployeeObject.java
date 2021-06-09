package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.jobTitle="SDET";
        e1.calculateSalary(88.23);
        System.out.println(e1.calculateSalary(52.50));


        Concractor sdetContractor=new Concractor();
        System.out.println("sdetContractor.calculateSalary(65) = " + sdetContractor.calculateSalary(65));
        sdetContractor.jobTitle="dmsad";
        System.out.println(sdetContractor);

    }
}
