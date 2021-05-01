package day40b_ReviewClass;

public class MergeStrings {
    public static void main(String[] args) {
//        User is given two Strings, which could vary in length,
//        merge these Strings so these Strings are
//        combined into one String. Any extra characters
//        from mismatched length String are at the end.
//                Ex:
//        String one = abc
//        String two = defgh
//        Output:
//        adbecfgh
//        Ex:
//        String one = java
//        String two = is
//        Output:
//        jiasva
//        String one = "abc";
//        String two ="defgh";
//        String str="";
//        if(two.length()>one.length()) {
//            for (int i = 0; i < one.length(); i++) {
//
//                str += "" + one.charAt(i) + two.charAt(i);
//            }
//            str+=two.substring(one.length());
////            for (int j = one.length(); j < two.length(); j++) {
////                str += two.charAt(j);
////            }
//
//            System.out.println(str);
//        }

        String one = "abcja";
        String two ="defgh";
        String str="";
        if(two.length()<one.length()) {
            for (int i = 0; i < two.length(); i++) {

                str += "" + one.charAt(i) + two.charAt(i);
            }
            str+=one.substring(two.length());

            System.out.println(str);
        }

    }
}


