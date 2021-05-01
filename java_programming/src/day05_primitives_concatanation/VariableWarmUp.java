package day05_primitives_concatanation;

public class VariableWarmUp {
    public static void main(String[] args) {
        int count = 10;
        System.out.println(count);
        count = 25;
        System.out.println(count);

        String school= "count of students :";
        String score= "there score is : ";
        int numberS= 401;
        double firstScore= 2.45;
        double secundScore=4.47;
        double thirdScore= 6.77;
        double totalScore = (firstScore + secundScore + thirdScore)/ 2;
        System.out.print("this is fun\t\n" +school);
        System.out.println("\"next line\"\n" + numberS);
        System.out.print(score);
        System.out.println(totalScore);
        boolean resault =true;
        System.out.println(resault);
                // this is fun
        //TODO lets practice more  every day all day :D


        System.out.println(school + numberS);
        System.out.println(score + totalScore);
    }
}
