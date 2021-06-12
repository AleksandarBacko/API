package day52_inheritance;

public class Instagram extends MobileApp{
    public void postPhoto() {
        System.out.println("Posting photo on instagram");
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        postPhoto();

    }
    @Override
    protected boolean download(){
        System.out.println("app"+ this.getName()+ " version: "+super.getName()+" is downloaded");
        return true;
    }
}
