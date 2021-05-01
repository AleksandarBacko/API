package day40b_ReviewClass;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g"));
    }
//    [Sum of Numbers from String]
//
//    Create a method that will accept a String and returns
//    the sum of all the numbers in the String.
//
//            Requirement: any numbers that are next to each
//    other are not single digit numbers but instead read as a full
//        number
//    Ex: a5bc12def100g
//    Here we would have added 5 + 12 + 100
//    NOT: 5 + 1 + 2 + 1 + 0 + 0

//    public static void back(String str){
//        String tog="";
//        for (int i =0;i<str.length();i++){
//            tog="";
//            if (Character.isLetter(str.charAt(i))){
//                continue;
//            }
//            if (Character.isDigit(str.charAt(i))){
//                tog+=str.charAt(i);
//                if(Character.isDigit(str.charAt(i+1))){
//                tog+=str.charAt(i+1);
//                }if(Character.isDigit(str.charAt(i+2))) {
//                    tog += str.charAt(i + 2);
//                }
//
//            }
//            System.out.println(tog);
//        }
//    }
    public static int getSumFromString(String str){
        int sum=0;
        String num="";


        for (int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num+=str.charAt(i);
                if (i==str.length()-1||!Character.isDigit(str.charAt(i+1))){
                    sum+=Integer.parseInt(num);
                    num="";
                }
            }
        }
        return sum;


    }
}
