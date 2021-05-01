package day07_arthimetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println(5+4+"java "+ 5 + 3);
        System.out.println(5+4+"java "+ (5 + 3));
        System.out.println(5+(4+"java ")+ (5 + 3));
        int num1=7;
        int num2=8;
        System.out.println(num1+num2);
        System.out.println(num1+" "+num2);

        char    char1='a';
        char    char2='b';
        System.out.println(char1+char2);///195

        System.out.println(char1+""+char2);///ab



    }
}
