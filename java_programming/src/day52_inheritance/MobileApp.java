package day52_inheritance;

public class MobileApp {
    private String name;
    private double version;


    protected boolean download(){
        System.out.println("app"+ name+ " version: "+version+" is downloaded");
        return true;
    }


    public void useTheApp(int minutes){
        System.out.println("Using app "+name+" verion "+version+" for time of "+minutes+" minutes");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}