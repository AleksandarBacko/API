package day43_list_custom_classes;

public class Employee {
    String jobTitle;
    String name;
}
class Workers{
    public static void main(String[] args) {
        Employee num1=new Employee();
        num1.jobTitle="server";
        num1.name="Aleks";
        System.out.println("num1 job  = " + num1.jobTitle);
        System.out.println("num1 name = " + num1.name);
    }
}
