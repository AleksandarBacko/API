package OfficeHours.Practice._6_14_practice;

public class Candy {
    /**Create a class Candy [Parent class]

     * instance variables:
     - brand (String), quantity (int), contains peanuts (boolean),

     * static variables:
     - number of total candy (int)

     * constructor to set all variables
     - Also increments total candy every time an object is made

     * encapsulate
     - Add one set of logic for quantity [ given number cannot be less than 0, otherwise it is not assigned]

     * override toString

     Create a class Take5 [Child class]

     * Inherits Candy class

     * constructor that invokes the parent constructor

     * extra: static hiding, final


     Create a class Twix [Child class]

     * Inherits Candy class

     * constructor that invokes the parent constructor

     * extra: static hiding, final, sub class

     Create a class CandyFactory [ No inheritance with Candy classes ]

     This class is to create objects of Candy, Take5, Twix and see how they are working
*/



    private String brand;
    private int quantity;
    private boolean containsPeanuts;
    private static int numberOfTotalCandy;

    public Candy(String brand, int quantity, boolean containsPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        this.containsPeanuts = containsPeanuts;
        numberOfTotalCandy++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity = quantity;
        }else {
            System.out.println("quantity cannot be less then 0");
        }
    }

    public boolean isContainsPeanuts() {
        return containsPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        this.containsPeanuts = containsPeanuts;
    }

    public static int getNumberOfTotalCandy() {
        return numberOfTotalCandy;
    }


    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }
}
