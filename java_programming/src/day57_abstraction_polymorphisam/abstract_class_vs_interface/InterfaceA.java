package day57_abstraction_polymorphisam.abstract_class_vs_interface;

public interface InterfaceA {
    public static final String TYPE="interfice";
    double MAX_COunt= 500;

    public abstract void absMethodD(int num);
    public static void staticMethodE(String str){
        System.out.println("staticMethod is calledWith str-"+ str);
    }

//    public InterfaceA(){
//        System.out.println("constructor in interface is not welcome");===============>>> ne koristimo constructor u interface
//    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}
