package day17_ternary_nested_condition;

public class VendingNestedif {
    public static void main(String[] args) {
        String selection="snack";
        String drink="tea";
        String snack="popcorn";
        if (selection.equals("drink")){
            System.out.println("drink selected");
            if(drink.equals("tea")){
                System.out.println("tea selected");
            }else if (drink.equals("coke")){
                System.out.println("coke selected");
            }else {
                System.out.println("we dont have "+drink);
            }
        }else if(selection.equals("snack")) {
            System.out.println("snack selected");
            if (snack.equals("chips")){
                System.out.println("chips selected");
            }else if (snack.equals("popcorn")){
                System.out.println("popcorn selected");
            }else{
                System.out.println("we dont have "+snack);
            }
        }else{
            System.out.println("WRONG SELECTION !");
        }
    }
}
