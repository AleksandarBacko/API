package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade=='B'|| grade == 'C'){
            System.out.println("Passed with " + grade);
        }else if (grade == 'D'){
            System.out.println("Qualify for retake");
        }else if (grade == 'E'){
            System.out.println("FAIL!");
        }else{
            System.out.println("Invalid Grade!");
        }
    }
}
