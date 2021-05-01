package day29_loops;

public class Arryintro {
    public static void main(String[] args) {
        int num = 10; //single variable
        //array variable
        int[] nums = new int[3];//[3] je length od nums koliko ih ima u njemu
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //nums[3] = 100; //ArrayIndexOutOfBoundsException
        //print values of array
        System.out.println("value at index 0 = " + nums[0]);//index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len=nums.length;
        System.out.println("len = " + len);
        nums[0]=100;
        nums[1]=500;
        nums[2]=300;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int []nume={312,3123,231,312,312,312,312,33};//svaki broj dobija [0,1,2...]i velicinu jednu po jednu kolko smo ukucali
        System.out.println(nume[1]);


    }
}
