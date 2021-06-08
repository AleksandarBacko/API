package OfficeHours.Practice._6_7_practice;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore store1=new WalmartStore("SantaBarbara");
        System.out.println("store1.toString() = " + store1.toString());



        Item pen = new Item("pen",1.4,10);
        Item hat=new Item("hat",3.5,20);
        ArrayList<Item> allitems=new ArrayList<>();
        allitems.add(pen);
        allitems.add(hat);


        WalmartStore storeTwo=new WalmartStore("SB",allitems);
        System.out.println(storeTwo);

        System.out.println(WalmartStore.companyName);

    }
}
