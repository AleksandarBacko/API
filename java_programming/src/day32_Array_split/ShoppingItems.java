package day32_Array_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iP11 c" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        for (int i =0;i<items.length;i++){
            if(items[i].equals("Gloves")){
                System.out.println(i);
                break;
            }


        }
        boolean foun=false;
        for (int i =0;i<items.length;i++){
            if(items[i].equalsIgnoreCase("iPod")){
                foun=true;
                break;
            }


        }
        System.out.println("foun = " + foun);
        System.out.println("Item \t\t\t"+"Price \t\t\t\t\t"+"ItemID \t\t\t\t");

        for (int j=0;j < items.length ;j++){
            System.out.println(items[j]+"\t\t - \t$"+prices[j]+" \t\t\t\t- \t#"+itemIDs[j]);

        }
        for (int j=0;j < items.length ;j++){
            if(items[j].equalsIgnoreCase("jacket")){
                System.out.println(items[j]+"\t\t - \t$"+prices[j]+" \t\t\t\t- \t#"+itemIDs[j]);
                break;
            }
        }




    }
}
