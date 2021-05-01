package day40b_ReviewClass;

public class CountLetters {
    public static void main(String[] args) {
        String sar="java is fun";
        countLetters(sar);

    }
    public static void countLetters(String str){
        String checked="";
        int count=0;
        for (int i=0;i<str.length();i++){
            char eachLetter =str.charAt(i);
            count=0;

            if (!checked.contains(""+eachLetter)) {


                for (int j = 0; j < str.length(); j++) {
                    char eachLetter2 = str.charAt(j);
                    if (eachLetter == eachLetter2) {
                        count++;
                    }
                }
                System.out.println(eachLetter + " - " + count);
                checked += eachLetter;
            }

        }
    }
}
