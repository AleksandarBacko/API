package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println(" min int:"+Integer.MIN_VALUE);
        System.out.println(" max int:"+Integer.MAX_VALUE);


        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.max(3123.312,3123.231));

        System.out.println(Double.compare(5,1));//1====> first larger than secund
        System.out.println(Double.compare(5,5));//2====> both equal
        System.out.println(Double.compare(5,55));//-1 first is smaller than secund

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('g'));
        System.out.println(Character.isUpperCase('D'));
        char letter='A';
        Character r=letter;
        if(Character.isAlphabetic(r)){
            System.out.println("yes");

            String word="JAva Is Fun";
            for (int i =0;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    System.out.print(word.charAt(i));
                }

            }
        }
    }
}
