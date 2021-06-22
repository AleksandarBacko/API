package OfficeHours.Practice._6_22_practice;

public abstract class OnlineShopping extends Shopping implements Shipping,AllowUsersToSell{
    @Override
    public abstract boolean payForShipping(double apply);

    @Override
    public abstract void buyItem();

    @Override
    public abstract void returnItem();




    public abstract void seeCart();


    // i ako ne stavimo override  ovaj class ima ove 3 metode iz drugih classova
}
