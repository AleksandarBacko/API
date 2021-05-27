package day18_conditionpractice_string;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make ="Audi";
        String model="A3";
        double leasePrice=0.0;
//        if (make.equals("MErcedes")&& model.equals("E")){
//            leasePrice=500.0;
//        }else if (make.equals("MErcedes")&& model.equals("A")){
//            leasePrice=400.0;
//        }
        if (make.equals("MErcedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("leasePrice = " + leasePrice);
        } else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 522.0;
            } else if (model.equals("A3")) {
                leasePrice = 412.0;
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("leasePrice = " + leasePrice);
        }else{
            System.out.println("we dont have that car info");
        }

    }
}
