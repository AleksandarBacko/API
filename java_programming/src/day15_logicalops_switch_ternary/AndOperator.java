package day15_logicalops_switch_ternary;

public class AndOperator {
    public static void main(String[] args) {
        boolean onsale = true;
        boolean freeShipping = true;
        String itemName = "Wooden spoon";

        if (onsale && freeShipping && itemName.equals("Wooden spoon")) {
            System.out.println("Add to Card - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);

        }
        if (freeShipping&&onsale&&itemName.equals("Wooden spoon")){
             System.out.println("Add to cart - "+itemName);
         }else{
             System.out.println("Continue shopping for good deals on - "+itemName);
         }
        // location,salary, remote, benefits


    }
}

