package day29_loops;

public class CountCharsNestedloop {
    public static void main(String[] args) {
        String str = "java";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char iLetter = str.charAt(i);
            count = 0;

            for(int j = 0; j <str.length(); j++){
                char jLetter = str.charAt(j);
                if(iLetter == jLetter){
                    count++;
                }

            }
            System.out.println(iLetter + "=" +count);
        }

    }
    }