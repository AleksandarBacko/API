package day38_methods;

public class MethidCallAnother {
    public static void main(String[] args) {
        Start();

    }

    public static void Start(){
        System.out.println("start");
        Continue();
    }

    public static void Continue(){
        System.out.println("continue");
        end();

    }
    public static void end(){
        System.out.println("end");
    }
}
