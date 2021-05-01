package day14_multi_branch_if_statments;

public class ElseIfStatment {
    public static void main(String[] args) {
        int day = 1;
        String result = "";
        if(day==1){
            result = "Monday";
        }else if(day==2){
            result = "Tuesday";
        }else if(day==3){
            result = "Wednesday";
        }else if(day==4){
            result= "Thursday";
        }else if(day == 5){
            result = "Friday";
        }else if(day == 6){
            result = "Saturday";
        }else if(day== 7){
            result = "Sunday";
        }else{
            result = "Invalid entry!";
        }

        System.out.println(result);
    }
}
