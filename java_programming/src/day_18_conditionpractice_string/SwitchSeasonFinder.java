package day_18_conditionpractice_string;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month=8;
        switch (month){
            case 2:
            case 1:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("invalid month "+month);
        }
    }
}
