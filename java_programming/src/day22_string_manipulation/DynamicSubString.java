package day22_string_manipulation;

public class DynamicSubString {
    public static void main(String[] args) {
        //substring + indexOf

        String result= "result count:12345";
        System.out.println(result.substring(13,18));//isti slucaj dole
        System.out.println(result.substring(13));//ovde
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");// nasli smo gde se : nalazi
        System.out.println(result.substring(colonIndex+1));//i onda smo ga dodali i dodali 1 da bi krenuo da printa od keca
        System.out.println(result.substring(result.indexOf("1")));//jos jedan nacin




        String today ="i learnd [java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(9+1,14));

        int start = today.indexOf("[");// best way !!!!
        int end =today.indexOf("]");
        System.out.println(today.substring(start+1,end));


    }
}
