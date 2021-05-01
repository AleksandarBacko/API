package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        printAge(26);
    }
    public static void count(int count){
        for(int i =0;i<=count;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: "+year + " Age: " + age);

    }
}
