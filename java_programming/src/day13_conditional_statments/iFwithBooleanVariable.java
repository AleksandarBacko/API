package day13_conditional_statments;

public class iFwithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry=true;
        if(isHungry==true) {
            System.out.println("I am hungry I will go get something to eat" );
            System.out.println("Than code java");

        }else {
            System.out.println("I am not hungry, lets keep coning java");
        }



            double price = 130.44;
            double budget = 200.00;
            boolean isAffordable = budget >= price;

            if (isAffordable == true) {
                System.out.println("Is affordable!!!");
            } else {
                System.out.println("Is TOO EXPENSIVE");
            }

            boolean isRemoteJob=true;
            if (isAffordable!=true){
                System.out.println("Sorry, I am not interested");
            }else{
                System.out.println("SUre, I am interested, whatd is interview process? ");
            }

    }
}
