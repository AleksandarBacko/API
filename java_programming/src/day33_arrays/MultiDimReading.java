package day33_arrays;

public class MultiDimReading {
    public static void main(String[] args) {
        int[][] nums2D = {
                {12, 55, 4, 7},    //0
                {123, 555, 9},       //1
                {56, 87, 455, 34},   //2
                {234, 12, 54, 23, 23}//3
        };
        for (int i = 0; i < nums2D.length; i++) {
            System.out.println();
            for (int j = 0; j < nums2D[i].length; j++) {
                System.out.print(nums2D[i][j] + " ");
            }
        }
    }
}