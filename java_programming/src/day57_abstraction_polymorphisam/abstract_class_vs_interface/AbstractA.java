package day57_abstraction_polymorphisam.abstract_class_vs_interface;

public abstract class AbstractA {
        int num1;
        private double price;
        public static int count;
        public final String type="abstract";
        public static final String LANGUAGE="java";

        public AbstractA(){
            System.out.println("AbstractA constructor");// mozemo da napravimo constructor ali ne mozemo da napravimo objekat
                                                        // constuctor koristimo da ga dodamo kad napravimo extend class
        }
//        private abstract void absMethodA();
//        public static abstract void absMethodA();========================>>>ne mozemo da zovemo private static i final metode u abstract classu
//        public final abstract void absMethodA();

    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }
}
