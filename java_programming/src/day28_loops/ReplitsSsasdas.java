package day28_loops;

import java.util.Scanner;

public class ReplitsSsasdas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countofjava=0;
        int countofpython=0;
        boolean res=true;

        for(int i =0;i<=sentence.length()-7;i++){
            String java=""+sentence.charAt(i)+sentence.charAt(i+1)+sentence.charAt(i+2)+sentence.charAt(i+3)+"";
            String python=""+sentence.charAt(i)+sentence.charAt(i+1)+sentence.charAt(i+2)+sentence.charAt(i+3)+sentence.charAt(i+4)+sentence.charAt(i+5);
            if(java.equals("java")){
                countofjava+=1;
            }else if(python.equals("python")){
                countofpython+=1;
            }else if(countofjava==countofpython){
                res=true;
            }else{
                res=false;


            }

        }
        System.out.println(res);

    }
}
