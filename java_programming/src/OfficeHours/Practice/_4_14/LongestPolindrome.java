package OfficeHours.Practice._4_14;

public class LongestPolindrome {
    public static void main(String[] args) {
//        [IQ] Longest Palindrome
//        Given a String array. Find the longest Palindrome String in your array.
//        Ex:
//        Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
//        Output: racecar
//        Ex:
//        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
//        Output: No palindrome
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestP="";

        for (String word : words) {
            boolean isPalindrome = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome&&word.length()>longestP.length()){
                longestP=word;
            }

        }
        System.out.println(longestP.isEmpty()?"IS empty":longestP);
    }
}

