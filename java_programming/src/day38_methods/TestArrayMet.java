package day38_methods;

public class TestArrayMet {
    public static void main(String[] args) {
        int[] num={3,123,231,33,};

        StringUtils.PrintArray(num);

        System.out.println(StringUtils.sumArray(num));
        System.out.println(StringUtils.contains(num,55));
    }
}
