package day14_multi_branch_if_statments;

public class YesORNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char  selection = 'y';
        boolean answer;

        if(selection=='y'){
            System.out.println("Your file will be deleted");
            answer=true;
        }else {
            System.out.println("File deletion canceled");
            answer=false;
        }
        System.out.println("Did file get delited? -" + answer);



    }
}
