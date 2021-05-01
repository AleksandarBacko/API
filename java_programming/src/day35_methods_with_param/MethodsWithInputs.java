package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(22);
        int count =213;
        displayValue(count);
        greatByName("Aleks");
        String name="Marko";
        greatByName(name);
    }
    public static void displayValue(int num){
        System.out.println("value is "+num);
    }
    public static void  greatByName(String name){
        System.out.println("Hello "+name+", how are you today?");
    }
}
