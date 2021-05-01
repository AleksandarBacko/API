package day04_varables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        int static2 = 22;
        int _static =22;
        int $tatic =444;
        int staticVar = 55;

        int salary$ = 55;
        // int 1sMonthSalary = 3000; - error connot start with number
        int $ = 10;
        int i =3;
        System.out.println($);
        System.out.println(i);
        //above variables work fine recommended.
        // you should use meaningfull names
        //int number-of-friends =400; - error
        int numberOfFriends= 401;
        int number_of_friends =401;

    }
}
