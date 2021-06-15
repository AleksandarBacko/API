package OfficeHours.Practice._6_15_paractice;

public class Gmail extends Email{

    static String domain;

    static {
        domain="Gmail";
    }

    
    public Gmail(String address,int numberOfEmails){
        super(address,numberOfEmails);
    }
}
