package day59_polymorphisam_exceptions.exception_handiling;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        try {

            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        }catch (Exception e){
            System.out.println("runtimeExeption happened and handeled");
        }

        System.out.println("After first try catch" );
    }
}
