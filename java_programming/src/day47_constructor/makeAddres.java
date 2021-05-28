package day47_constructor;

public class makeAddres {
    public static void main(String[] args) {
        Addres moja=new Addres();
        moja.setStreet("4551 Auhay dr");
        moja.setCity("Santa Barbara");
        moja.setState("CA");
        moja.setZipCode("93110");
        moja.setCountry("USA");
        System.out.println(moja.toString());
        System.out.println(moja.getCity());


    }
}
