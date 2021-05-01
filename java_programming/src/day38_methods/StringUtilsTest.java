package day38_methods;

public class StringUtilsTest {
    public static void main(String[] args) {
        String userName="";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Usermane cannot be null or empty");
        }
        String test="cIviC";
        if (StringUtils.isPalindrome(test)){
            System.out.println("yes it is");
        }else {
            System.out.println("no isnt");
        }
        System.out.println( StringUtils.reverse(test));




    }
}
