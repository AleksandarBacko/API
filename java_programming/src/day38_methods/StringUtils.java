package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));

    }

    public static boolean isNullOrEmpty(String str) {
        if (str.equals("")){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static String reverse(String str){
        String rts="";
        for (int i =str.length()-1;i>=0;i--){
            rts+=str.charAt(i);
        }
        return rts;
    }

    public static void PrintArray(int[] nums){

        for(int each:nums){
            System.out.print(each+ " ");
        }
        System.out.println();
    }

    public static int  sumArray(int[] sum){
        int sume=0;
        for (int i =0;i <sum.length;i++){
            sume+= sum[i];

        }
        return sume;
    }

    public static boolean contains(int[] nums,int num){

        for (int i=0;i<nums.length;i++){
            if(nums[i]==num){
                return true;
            }
        }
        return false;
    }
}
