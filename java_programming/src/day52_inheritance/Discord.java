package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone) {
        System.out.println("Chatting with " + someone +" on Discord");
    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println("using discord overriding method ");
    }
@Override
    protected boolean download(){
        System.out.println("app"+ this.getName()+ " version: "+this.getVersion()+" is downloaded");
        return true;
    }
}
