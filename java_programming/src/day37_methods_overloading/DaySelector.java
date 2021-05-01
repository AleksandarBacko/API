package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(6));
        for (int i =1;i<8;i++){
            System.out.println(getDayName(i));
        }
    }//first method with multiply return
    public static String getDayName (int day){
        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturaday";
            case 7:
                return  "Sunday";
            default:
                System.out.println("Invalid day");
                return null;
        }

    }
//method with one return
    public static String getDayNameV2(int day){
        String dayName;
        switch (day){
            case 1:dayName= "Monday";
            break;
            case 2:dayName="Tuesday";
            break;
            case 3: dayName="Wednesday";
            break;
            case 4:dayName= "Thursday";
            break;
            case 5:dayName= "Friday";
            break;
            case 6:dayName="Satutday";
            break;
            case 7:dayName="Sunday";
            default:
                System.out.println("Invalid day");
                dayName=null   ;
        }
        return dayName;
    }
}
