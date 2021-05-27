package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        //System.out.println(getIntegerList());
        System.out.println(System.nanoTime());
        long start=System.nanoTime();
        long end=System.nanoTime();
        System.out.println("ArrayList time ="+(end-start));
    }

    public static List<Integer> getIntegerList(){
        List<Integer> nums =new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }
}
