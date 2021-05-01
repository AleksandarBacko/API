package day06_arithmetic_operators;

public class HelloFirst {
    public static void main(String[] args) {
        String firstName= "Aeleksandar ";
        String lastName="Backovic";
        String fullName= firstName + lastName;
        System.out.println("My fullname is :\t\t\t"+fullName);

        int i=10;
        int j=5;
        int addition=i+j;
        int subtraction= i-j;
        int multiplication= i*j;
        int division=i/j;
        int mod=i%j;// kad ovo radimo imamo koliko puta u 10 imamo 5 u ovom slucaju 2x
        // i sistem pokazuje da nemamo nista ostalo pokazuje 0
        //u drugom slucaju ako imamo 11 i imamo 5 onda imam (5 u 10 )2x i ostaje 1 kao remajnder
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);
    }
}
