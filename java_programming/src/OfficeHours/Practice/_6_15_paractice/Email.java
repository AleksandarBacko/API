package OfficeHours.Practice._6_15_paractice;

public  class Email {

    final String ADDRESS;
    int numberOfEmails;
    static String domain;
    static {
        domain="generic";
    }
    public Email(String address,int numberOfEmails){
        this.ADDRESS=address;
        this.numberOfEmails=numberOfEmails;

    }

    public static void sendEmail(){
        System.out.println("sending from Parent");
    }

    @Override
    public String toString() {
        return "Email{" +
                "ADDRESS='" + ADDRESS + '\'' +
                ", numberOfEmails=" + numberOfEmails +
                "domain = "+domain+'}';
    }
}
