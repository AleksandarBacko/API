package day57_abstraction_polymorphisam.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB {
    @Override
    public void methodB() {
        System.out.println("methodB overvride version is called");
    }

    @Override
    public void absMethodA() {
        System.out.println("abstract methodA is called");
    }


    public static void  staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called"+ num);
    }
}
