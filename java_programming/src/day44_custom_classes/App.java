package day44_custom_classes;

public class App {
    String name;
    String version;

    public void opem(){
        System.out.println("app is open");
        if (!version.equals("new")){
            System.out.println("vrong version");
        }else {
            System.out.println("right version");
        }

    }
}
