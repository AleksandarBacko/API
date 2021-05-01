package OfficeHours.Practice._4_7_practice;

public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind"; // word
        int words = 1;

        for(int i=0; i < str.length(); i++) {

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;
            }

        }

        System.out.println("Words: " + words);
    }
}
