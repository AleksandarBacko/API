package day17_ternary_nested_condition;

public class TernaryExamples {
    public static void main(String[] args) {

        int score= 90;
        String quality="good";
        String result = (score>60)? "pass": "fail";
        int x =(quality.equals("good"))? 100: 0 ;
        char grade= (score>90)?'A':'B';
        String evenOdd=(score%2==0)?"even":"odd";
        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("grade = " + grade);
        System.out.println("evenOdd = " + evenOdd);
    }
}
