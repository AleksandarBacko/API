package OfficeHours.Practice._4_13;

public class MultipleWords {
    public static void main(String[] args) {
//        Given a String of words that are separate by commas. Find and print any words that have more than one word
//                Example
//        Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer"
//        Output:
//        wooden spoons
//        trash can
//        dish washer

        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[]arrWords=words.split(", ");

        for (int i =0;i<arrWords.length;i++){
            if (arrWords[i].contains(" ")){
                System.out.println(arrWords[i]);
            }
        }

    }
}
