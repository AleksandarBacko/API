package OfficeHours.Practice._5_18_practice;
/**
 * [AnimalSpecies]
 * Create a class AnimalSpecies
 * -Create these variables in the class: name (String), population (int  -for practice we can consider 1 unit as 1 million. Ex: population = 20 would represent 20 million ), growth rate (int -percent number)
 * -Create these methods (non-static):
 * -setInfo()
 *      -parameters: name, population, and growth rate (Do not name the parameters the same as your class variable names).
 *      -returns: void
 *      -action: assigns the name, population, and growth rate  of the object given from the parameters.
 * -getName()
 *      -no parameters, returns the name variable
 * -getPopulation ()
 *      -no parameters, returns the population variable
 * -getGrowthRate()
 *      -no parameters, returns the growth rate variable
 * -toString() generate the toStringmethod as shown in class. See Murodil_only for screenshots of steps
 * -Create a class Earth
 * -Create AnimalSpecies objects, call the getInfo and get methods of the objects
 */
public class AnimalSpecies {
   String name;
   int population;
   int growthRate;
//   String planet="Earth";

   public void setInfo(String setName,int setpopulation,int setGrowthrate){
       name=setName;
       population=setpopulation;
       growthRate=setGrowthrate;
   }
   public String getName(){
       if(name==null){
           return "No name defined";
       }
       return name;
   }
   public int getPopulation(){
       return population;
   }
   public int getGrowthRate(){
       return growthRate;
   }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }
}
