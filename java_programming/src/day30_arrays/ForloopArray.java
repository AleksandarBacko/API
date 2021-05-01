package day30_arrays;

public class ForloopArray {
    public static void main(String[] args) {

        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum: data){
            System.out.println(eachNum);//for each loop no posible to write code beckword ||ili pisanje u nazad --


        }
        for ( int i = 0; i < data.length; i++) {
            System.out.println(data [i]);
        }
        System.out.println(data[data.length-1]);
        for (int i = data.length-1; i >=0; i-- ) {
            System.out.print(" " + data[i]);
        }
    }
}
