package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!false));

        int age =2;
        if(!(age>7)){
            System.out.println("Need to sit in child car seat.");

        }

        boolean isSmokingAllowed=false;
        if ((!isSmokingAllowed)) {
            System.out.println("Smoking is now allowed hear.Exit!");
        }

        boolean isaffordable=true;
        if (!isaffordable){
            System.out.println("is affordable");
        }else {
            System.out.println("is not afordable");
        }
    }
}
