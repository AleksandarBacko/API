package OfficeHours.Practice._5_18_practice;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies dogs=new AnimalSpecies();
        dogs.setInfo("pitbull",2,2);
        System.out.println(dogs.getName());
        System.out.println(dogs);

        AnimalSpecies cats= new AnimalSpecies();
        System.out.println(cats);
        cats.setInfo("perisan",40,22);
        System.out.println(cats);
    }
}
