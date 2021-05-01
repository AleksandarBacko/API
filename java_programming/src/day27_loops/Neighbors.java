package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word="jaaavvaa";
        for(int i=0;i<=word.length()-2;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                System.out.println(""+word.charAt(i)+word.charAt(i+1)+" beep beep");
            }
        }
    }
}
