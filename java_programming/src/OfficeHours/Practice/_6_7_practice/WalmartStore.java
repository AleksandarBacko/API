package OfficeHours.Practice._6_7_practice;

import java.util.ArrayList;

public class WalmartStore {
    /**Create a class Item

     -> Instance variables:
     - name (String), price (double), quantity (int)

     -> Constructor:
     - Accepts and initializes all three variables

     -> Instance methods:
     - toString(): returns information about Item

     Create a class WalmartStore

     -> Instance variables:
     - location (String), totalWorth (double)
     - inventory (List of Items)

     -> Static variables:
     - company name (String),

     -> Constructor:
     - Accepts and initializes location, has an empty inventory

     - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory

     -> Instance methods:

     - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable

     - restockInventory(List of Item) -> Adds the given items to the store inventory.
     Challenge: If the item exists in the inventory already (same item name and price)


     - toString(): returns information about Item */

    static {
        System.out.println("static block called");
        companyName="Walmart";

    }

    String location;
    double totalWorth;
    ArrayList<Item> inventory;

    static String companyName;

    public WalmartStore(String location) {
        this.location = location;
        inventory=new ArrayList<>();
    }

    public WalmartStore(String location, ArrayList<Item> inventory) {
        this.location = location;
        this.inventory = inventory;
        calculateWorth();
    }

    public void calculateWorth(){
        for (Item each: inventory){
            totalWorth+=(each.price*each.quantity);
        }
    }

    @Override
    public String toString() {
        return "WalmartStore{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", inventory=" + inventory +
                '}';
    }
}
