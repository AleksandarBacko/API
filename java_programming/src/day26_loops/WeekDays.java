package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
        for(int n=1;n<=10;n++){
            switch (n){
                case 1:
                    System.out.println("Monday - "+n);
                    break;
                case 2:
                    System.out.println("Tuesday  - "+n);
                    break;
                case 3:
                    System.out.println("Wednesday - "+n);
                    break;
                case 4:
                    System.out.println("Thursday - "+n);
                    break;
                case 5:
                    System.out.println("Friday - "+n);
                    break;
                case 6:
                    System.out.println("Saturday - "+n);
                    break;
                case 7:
                    System.out.println("Sunday - "+n);
                    break;
                    //mozemo da  defoult (kao else block) ovde za ostale brojeve ali sam ja uzeo samo za vezbu ostatak
                case 8:
                    System.out.println("no such day, it is java day - "+n);
                    break;
                case 9:
                    if (n>=9){
                        System.out.println("no day - "+n);
                        return;
                    }


            }
        }
    }
}
