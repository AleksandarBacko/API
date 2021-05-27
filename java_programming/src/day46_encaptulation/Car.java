package day46_encaptulation;

public class Car {
    private String model;
    private int year;
    private int milage;
    public void setModel(String carm){
        model=carm;
    }
//    public void setYear(int cary){
//        year=cary;
    public void setYear(int year){
        this.year=year;////this.year uzimam da bi koristili isto ime ali instance variable(year)
                        /// i kad pozivamo metod trazica u zagradi samo (year ne cary kao u proslom slucaju)
    }
    public void setMilage(int carm){
        milage=carm;

    }

    public int getMilage() {
        return milage;
    }

    public int getYear() {
        return year;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", milage=" + milage +
                '}';
    }
}
