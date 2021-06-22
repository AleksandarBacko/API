package OfficeHours.Practice._6_22_practice;

public class Amazon extends OnlineShopping{
    @Override
    public boolean payForShipping(double apply) {
       return apply>50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon online");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon Online");
    }

    @Override
    public void seeCart() {

    }

    @Override
    public void uploadProduct() {

    }
}
