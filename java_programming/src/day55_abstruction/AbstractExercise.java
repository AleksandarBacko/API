package day55_abstruction;

public abstract class AbstractExercise {
    int calories;
    public   void start(){
        System.out.println("Start");
    }
    public abstract void perform();
    public abstract int getCaloriesCount(int min);
}



class Running extends AbstractExercise {
    @Override
    public void perform() {
        System.out.println("Runing");
    }

    @Override
    public int getCaloriesCount(int min) {
        calories = min * 20;
        return calories;
    }
}



class Swiming extends AbstractExercise{

    @Override
    public void perform(){
        System.out.println("Swiming");
    }

    @Override
    public int getCaloriesCount(int min){
      calories=min*30;
      return calories;
    }
}


class Lifting extends AbstractExercise{

    @Override
    public  void start(){
        System.out.println("lol");

    }
    @Override
    public void perform(){
        System.out.println("Lifting");
    }
    @Override
    public int getCaloriesCount(int min){
        calories=min*40;
    return calories;
    }
}


class javaPrograming extends AbstractExercise{
    @Override
    public void perform(){
        System.out.println("Java Programing");
    }
    @Override
    public int getCaloriesCount(int min){
        calories=min*1000;
        return calories;
    }
}


