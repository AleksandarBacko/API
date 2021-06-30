package OfficeHours.Practice._replits.DogReplits;

import day58_polymorphism.A;

public class Dog extends Animal {
    private String breed;
    private int humanYears;
    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"+
                "Breed: " + breed + "\n" +
                "Age in calendar years: "+ age+"\n"+
                "Age in human Years: " + humanYears;
    }
    public void getAgeInHumanYears(){
        if (super.age<=2){
            this.humanYears=age*11;
        }else {
            this.humanYears=22 + ((age-2) * 5);
        }
    }
    public boolean equals(Dog dog){
        if (this.name.equals(dog.name)&&this.age==(dog.age)&&this.breed.equals(dog.breed)){
            return true;
        }
        return false;
    }
}
