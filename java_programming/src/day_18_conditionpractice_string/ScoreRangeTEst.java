package day_18_conditionpractice_string;

public class ScoreRangeTEst {
    public static void main(String[] args) {
        int score= 1;

        if (score>=1&&score<=40){
            System.out.println("D");
        }else if(score>=41&&score<=60){
            System.out.println("C");
        }else if(score>=61&&score<=90){
            System.out.println("B");
        }else if(score>=91&&score<=100){

        }else {
            System.out.println("invalid score");
        }
    }
}
