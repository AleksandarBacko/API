package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("prices less than 100");
        for(int i =0;i<prices.length;i++){
            if (prices[i]<100){
                System.out.println(prices[i]);
            }
        }
        for( double each : prices){
            if(each < 100){
                System.out.println(each);
            }
    }
        for( double each : prices){
            if(each < 70 &&each>10){
                System.out.println(each);
            }
        }
        int count=0;
        for( double each : prices){
            if(each >50){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("\nCountries ith name length more than 7 - inclusive");
        for ( String each : countries){
            if (each.length() > 7){
                System.out.print(each + " ");
            }
        }
    }
}
