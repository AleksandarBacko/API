package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("Kibi",3,'|'));
    }
    public static String repeatString(String word, int times, char delimeter){
        String repeat="";

        for(int i=0; i<times;i++) {
            repeat += word + delimeter;
        }
        repeat=repeat.substring(0,repeat.length()-2);
        return repeat;

    }

}
