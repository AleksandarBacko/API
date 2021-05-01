package day16_swich_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum =1;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verison, Starbucks");
                break;
            case 2:

                System.out.println("Floor 2 selected. Cybertek, NASA, Intelsat");
                break;
            case 3:

                System.out.println("Floor 3 selected. LYFT, BOFA,Steak House");
                break;
            default:
                System.out.println("Wrong flore number " + floorNum);
        }

    }
}
