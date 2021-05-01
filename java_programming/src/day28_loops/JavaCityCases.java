package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases =0;
        int day;
        for(day=1;day<=30;day++){
            if (day%7==0){
                totalCases+=400;
                System.out.println(""+"day "+day+" we have "+400+" Cases");
            }else{
                totalCases+=200;
                System.out.println(""+"day "+day+" we have "+200+" Cases");
            }

        }System.out.println("We have "+totalCases+" cases this mounth");
    }
}
