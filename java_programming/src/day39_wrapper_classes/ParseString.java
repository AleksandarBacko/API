package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);
        String dom="2131.3";
        double num2=Double.parseDouble(dom);
        Double num3 =num2;


        String sentence = "i wrote 85 lines today"; //todo CEMENT it!!!!
        String [] sentArr= sentence.split(" "); //
        int sent  = Integer.parseInt(sentArr[2]);
        System.out.println(sent);
    }



    }