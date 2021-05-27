package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
//        System.out.println(getDays());
//        System.out.println("getDays().size() = " + getDays().size());
//        System.out.println("getDays().get(0) = " + getDays().get(0));
//        List<String> dayNames = getDays();
//        System.out.println("dayNames = " + dayNames);
//        dayNames.add("java day");
//        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
//        dayNames.removeIf(d -> d.length() == 6); // za ovo mozemo da koristimo kao for each loop i dajemo if expreshn "d" je ime kao u for each loopu bilo sta mozemo da stavimo ne mora da bude "d"
//        System.out.println("dayNames after removeIf = " + dayNames);

        List<Integer> arrr= getRandomList(41);
        System.out.println(getRandomList(4));
        System.out.println(getRandomList(5));
        System.out.println(getRandomList(4));
        System.out.println(arrr);

        arrr.removeIf(n -> n< 80);
        System.out.println(arrr);
    }

//    public static List<String> getDays() {
//        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
//        List<String> days = new ArrayList<>();
//        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
//        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
//        return days;
//    }
    public static List<Integer> getRandomList(int size){
        Random ram=new Random();
        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(ram.nextInt(100));

        }
        return arr;
    }
}
