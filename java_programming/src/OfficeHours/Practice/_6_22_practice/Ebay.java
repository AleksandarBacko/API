package OfficeHours.Practice._6_22_practice;

public class Ebay extends OnlineShopping{
    @Override
    public boolean payForShipping(double apply) {
        return apply>50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Ebay online");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Ebay");
    }

    @Override
    public void seeCart() {

    }

    @Override
    public void uploadProduct() {

    }
}
