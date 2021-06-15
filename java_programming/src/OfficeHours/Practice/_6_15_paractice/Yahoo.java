package OfficeHours.Practice._6_15_paractice;

public class Yahoo extends Email{
    static String domain;
    static {
        domain="Yahoo";
    }
    public Yahoo(String address,int numberOfEmails){
        super(address,numberOfEmails);
    }
}

