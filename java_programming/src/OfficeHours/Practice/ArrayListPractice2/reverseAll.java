package OfficeHours.Practice.ArrayListPractice2;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseAll {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(retrn(words));


    }
    public static ArrayList<String> retrn(ArrayList<String> wor) {

        String retu ="";                     // wor.toString();
        String ading="";
//        retu=retu.replace("[","");
//        retu=retu.replace("]","");
//        for (int i=retu.length()-1;i>=0;i--){
//            ading+=retu.charAt(i);
//        }
//        String[] sp=ading.split(" ,");
//        ArrayList<String> ret=new ArrayList<>(Arrays.asList(sp));
//        return ret;

        ArrayList<String> ret=new ArrayList<>();
        for (int i = wor.size()-1; i >= 0; i--) {///// ovde vadim poslednju rec iz  liste wor i add u ret
            ret.add(wor.get(i));

            for (int k = 0; k <ret.size()- 1; k++) {///////ovde vadim rec na lokaciji size od ret(u ovom slucaju je 1-1)
                retu=ret.get(ret.size()- 1);//////////////// ovde assingujem retu value od ret(0)
                ading="";
                for(int j=retu.length()-1;j>=0;j--){//////////ovde citam retu svaki char i dodajem u ading da napravim obrnutu rec
                    ading+=retu.charAt(j);

                }
                ret.set(k,ading);

            }



            }

            return ret;
        }
    }














