package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> cars= new ArrayList<>();
        cars.add("toyota");
        cars.add("mazda");
        cars.add("ford");
        cars.add("moskvich");
        cars.add("tesla");

        //add to index 0 and mouve everything for one index ... keep others
        cars.add(0,"jeep");
        cars.add(1,"lada");
        cars.add(2,"yugo");
        System.out.println(cars.toString());


        String allCars=cars.toString();
        System.out.println(allCars);

        // change index 0 to lamborghini..replace index 0 what ever is on it replace with lamborghini
        cars.set(0,"Lamborghini");

        cars.set(cars.indexOf("lada"),"fiat");
        System.out.println(cars);

        int indexOfLada=cars.indexOf("lada");

        if (cars.contains("lada")){
            cars.set(cars.indexOf("lada"),"bugati");
        }else {
            System.out.println("lada is not found");
        }

//        cars.set(0,"prius");
//        cars.set(1,"lexus");

        for (int i =0;i< cars.size();i++){
            if (cars.get(i).equalsIgnoreCase("Lamborghini")){
                cars.set(i,"prius");
            }
            if(cars.get(i).equalsIgnoreCase("fiat")){
                cars.set(i,"lexus");
            }
            if (cars.get(i).equalsIgnoreCase("mazda")){
                cars.set(i,"audi");
            }
        }
        System.out.println(cars);

    }
}
