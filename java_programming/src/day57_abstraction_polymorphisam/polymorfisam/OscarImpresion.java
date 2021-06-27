package day57_abstraction_polymorphisam.polymorfisam;

public interface OscarImpresion {
    public default void impression(){
        System.out.println("he win today !!!");
    }
}
