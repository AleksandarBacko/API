package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
//        String word = "githiub";
//        char letter = 'i';
//        int index = -1;
//
//        for ( index = 0; index < word.length(); index++) {
//
//            if (word.charAt(index) == letter){
//                System.out.println("letter i at " + word + " is in index = " + index);
//            }
//        }
//    }
//}
        String word = "gitghub";
        char letter = 'g';
        int index = -1;

        for(int n = 0; n < word.length(); n++) {
            // System.out.println(n +" - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter +" is found at index " + index);
                break; //exit for loop
            }
        }

        if(index == -1) {
            System.out.println(letter + " is not present");
        }
    }
}
