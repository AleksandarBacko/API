package day32_Array_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence="java is fun";
        String[] arrs=sentence.split(" ");
        String rev="";
        for (int i =arrs.length-1;i>=0;i--){
            rev+=arrs[i]+" ";
        } System.out.println(rev);
    }
}
