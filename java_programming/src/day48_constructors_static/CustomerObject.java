package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1= new Customer();
        System.out.println(cs1.toString());
        cs1.setId(22);
        cs1.setName("Bob");
        System.out.println(cs1);


        Customer cs2= new Customer("bob med",13);
        System.out.println(cs2);


        Customer[] todaysCustomers={cs1,cs2,new Customer("papan",33)};
        for (Customer each:todaysCustomers){
            System.out.println(each);
        }


        ArrayList<Customer> cus=new ArrayList<>(Arrays.asList(todaysCustomers));

        for (Customer each:cus){
            System.out.println(each);
        }
    }
}
