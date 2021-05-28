package day18_conditionpractice_string;

public class LargestNum {
    public static void main(String[] args) {
        int num1=100;
        int num2=44;
        int num3 = 11;

        if (num1>=num2&&num1>=num3){
            System.out.println("Largest num is:"+num1);
        }else if (num2>=num1&&num2>=num3){
            System.out.println("Largest num is:"+num2);
        }else if (num3>=num1&&num3>=num2) {
            System.out.println("Largest num is:" + num3);
        }
    }
}
