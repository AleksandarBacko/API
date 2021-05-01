package day07_arthimetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte n1=4;
        int n2=n1;
        //iznad ce da radi jer manju velicinu pretvaramo u vecu , i ne moramo da je Castujemo/prevedemo u drugu jer prevodi samo

        int n3=3;
        byte n4= (byte)n3;
        short n5= (short)n3;
        //iznad moramo da dodamo u koju velicinu ga menjamo jer menjamo manju u vecu velicinu

        long m1=2000;
        double m2=m1;
        // razlog je zato sto su ista velicina od 8 byte data
    }
}
