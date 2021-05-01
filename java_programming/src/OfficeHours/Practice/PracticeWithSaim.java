package OfficeHours.Practice;

public class PracticeWithSaim {
    public static void main(String[] args) {
        String name= "Aleksandar B ";
        byte age= 26;
        char gender= 'M';
        boolean student= true;
        short numberOfSiblings= 1;
        long favoriteNumber= 7;
        int numberOfSeasonsInYourArea= 2;
        double birthDate= 11.23;
        int year=1994;
        String fullBirthDate="11.23.1994.";
        String favoriteQuote= "work hard - play hard";
        System.out.println("Hello my name is:\t\t\t\t\t\t"+name+
                "\nI am:\t\t\t\t\t\t\t\t\t"+ age + " old"+
                "\nMy gender is:\t\t\t\t\t\t\t"+gender+
                "\nI am the student:\t\t\t\t\t\t"+student+
                "\nI have brother or sister:\t\t\t\t"+numberOfSiblings+" brother"+
                "\nHow many seasons is in my area:\t\t\t"+numberOfSeasonsInYourArea+" and most of the time is hot :D"+
                "\nMy favorit number is:\t\t\t\t\t"+favoriteNumber+
                "\nMy birthday is on:\t\t\t\t\t\t"+birthDate+
                "\nI am born in Belgrade:\t\t\t\t\t"+year+
                "\nMy birth date is:\t\t\t\t\t\t"+fullBirthDate+
                "\nMy favorite quote is:\t\t\t\t\t"+favoriteQuote
                );

        String fullBIRThdate= "" + birthDate + "." + year;
        System.out.println(fullBIRThdate);
        String fullBirtHdate=""+ birthDate + '.' + year;
        System.out.println(fullBirtHdate);



    }

}
