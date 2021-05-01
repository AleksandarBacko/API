package day07_arthimetic_operators_casting;



public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10+5);
        System.out.println(10+ 5-3);
        System.out.println(10-5+3);
        System.out.println(10-(5+3));


        System.out.println(2*3) ;//6
        System.out.println(2*3/3);//2
        System.out.println(20/(2*2));//5
// nista ne mozemo da delimo sa nulom sistem pokazuje error primer:10/0
        //ali mozemo da delimo sa nulom na primer: 0/10 je 0
        System.out.println(2+5*3);//17
        System.out.println((2+5)*3);//21
        System.out.println(0*10);
        System.out.println(10*0);
        System.out.println(10/3);// dva cela broja uvek daju ceo broj u ovom slucaju 3
        System.out.println(10/3.0);//kada imam decimalni broj mora da se uzme decimalni variable
        //u ovom slucaju delim sa 3.0 racuna ga kao decimalni broj
    }
}
