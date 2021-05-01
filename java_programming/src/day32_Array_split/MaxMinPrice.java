package day32_Array_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iP11 c" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        double maxP=0;
        int index=0;
        System.out.println("item with bigest price");
        for(int i =0;i<prices.length;i++) {
            if (prices[i] > maxP) {
                maxP = prices[i];
                index = i;
            }
        }
        System.out.println(items[index]+"  "+prices[index]+"  "+itemIDs[index]);
        double minP=10000000;
        int index1=0;
        System.out.println("item with smallest price price");
        for(int i =0;i<prices.length;i++) {
            if (prices[i] < minP) {
                minP = prices[i];
                index1 = i;
            }
        }
        System.out.println(items[index1]+"  "+prices[index1]+"  "+itemIDs[index1]);





    }
}
