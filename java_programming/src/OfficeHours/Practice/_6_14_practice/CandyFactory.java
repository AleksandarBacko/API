package OfficeHours.Practice._6_14_practice;

public class CandyFactory {

    public static void main(String[] args) {
        Candy candy = new Candy("generic",10,true);
        System.out.println(candy);

        Take5 take5=new Take5(10,true);
        System.out.println(take5);


        Twix twix=new Twix(2,false);
        System.out.println(twix);

        System.out.println(Candy.getNumberOfTotalCandy());

    }
}
