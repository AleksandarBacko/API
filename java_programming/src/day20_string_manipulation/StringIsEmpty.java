package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle=" ";
        System.out.println(jobTitle.length()==0);
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));
        System.out.println(jobTitle.isEmpty());
        String veggie ="carrots";
        if((!veggie.isEmpty())){
            System.out.println("we have carrots");
        }else{
            System.out.println("we need to do grocery");
        }
    }
}
