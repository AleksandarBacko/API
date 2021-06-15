package OfficeHours.Practice._6_15_paractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EmailObjects {
    public static void main(String[] args) {


        Email email = new Email("Anton@cybertekschool.com", 43);
        System.out.println(email);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        Gmail gmail=new Gmail("Anton@gmail.com",44);
        System.out.println(gmail);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        Yahoo yahoo=new Yahoo("Anton@yahoo.com",32);
        System.out.println(yahoo);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Email email1 = new Email("Anton@cybertekschool.com", 43);
        System.out.println(email1);
    }
}
