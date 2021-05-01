package day15_logicalops_switch_ternary;

public class AndOperatorsAgain {
    public static void main(String[] args) {
        String location="Santa Barbara";
        int salary=100000;
        boolean isRemote =true;
        boolean benefits=true;

        if(location.equals("Santa Barbara") && salary>=100000 && isRemote && benefits){
            System.out.println("Get hired company has everything you need!");
        }else{
            System.out.println("Dont get hired !");
        }
    }
}
