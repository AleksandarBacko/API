package day25_loops;

public class WhileHungr {
    public static void main(String[] args) {
        boolean ishungry=true;
        int bananas=0;

        while(ishungry){
            bananas++;
            System.out.println(bananas);
                    if (bananas==3){
                        ishungry=false;
                    }
        }
        System.out.println("Im full, i had "+bananas);
    }
}
