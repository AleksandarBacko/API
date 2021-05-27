package day45_oop;

public class Coffee {
    String coffee;
    double cup;
    public double amount(){
        return cup;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffee='" + coffee + '\'' +
                ", cup=" + cup +
                '}';
    }

    public double drink(double am){
        if(am>0&& am<100) {
            cup = cup - am;
            if (cup > 0 && cup < 100) {
                return am;
            }else if(cup<0){
               cup=cup-cup+(-cup);
               cup=100-cup;
                return am;
            }
        }
        return 0;

    }
    public double refill(){
        if (cup<100){
            cup=100;
        }return cup;
    }
    public String type(String ty){
        coffee=ty;
        return coffee;
    }
}
