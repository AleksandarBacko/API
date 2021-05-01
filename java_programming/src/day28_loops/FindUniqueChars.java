package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word="jaavva";
        String uniqu="";
        for(int i =0;i<word.length();i++){
            //System.out.println(word.charAt(i));
           if(!uniqu.contains(word.charAt(i)+"")){
               uniqu+=word.charAt(i);
            }

        }
        System.out.println(uniqu);
    }
}
