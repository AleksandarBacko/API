package day12_boolean_conditional_statments;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit=55;
        int currentSpeed=45;
        System.out.println( currentSpeed < speedLimit);
        System.out.println( currentSpeed > speedLimit);
        System.out.println( currentSpeed == speedLimit);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        isSpeeding=currentSpeed<speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        currentSpeed+=20;
        isSpeeding=currentSpeed>speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);


        double accountBalance = 911.25;
        double itemPrice= 99.25;
        System.out.println("you can afford : "+ (accountBalance>=itemPrice));
        boolean canAfford= accountBalance>=itemPrice;
        if (itemPrice>accountBalance) {
            System.out.println("You cant afford it !");
        }else{
            System.out.println("You can afford it");
        }
        if (itemPrice<150)
            System.out.println("THAT IS CHEEP !!!");
        if (accountBalance == 99.25)
            System.out.println("You will be broke you cant afford it ! Because your balance is :"+accountBalance);


    }
}
