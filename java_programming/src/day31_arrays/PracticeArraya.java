package day31_arrays;

public class PracticeArraya {
    public static void main(String[] args) {
//        100numberarray  1.Create an int array called numbers that has length
//    of 100 2.Assign 1-100 to each index of the array.  Then use a for each
//        loop to print out all the elements of the array
        int[] arrayo = new int[100];
        int count = 0;
        for (int i = 0; i <=arrayo.length-1; i++) {
            arrayo[i]=i+1;
            System.out.println(arrayo[i]);

        }

    }
}
