package day32_Array_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words="java,python,selenium,html";
        String[] wordsAray =words.split(",");
        System.out.println(Arrays.toString(wordsAray));
        System.out.println(wordsAray.length);

        String sentence="today i am coding java arrays";
        String[] sentA=sentence.split(" ");
        for (String da : sentA){
            System.out.println(da);
        }
        System.out.println("number of words in sentence "+sentA.length);

    }
}
