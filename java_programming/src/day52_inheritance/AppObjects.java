package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp=new MobileApp();
        mobileApp.setName("youTube");
        mobileApp.useTheApp(10);
        Instagram instagram=new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);


        Discord discord=new Discord();
        discord.setName("discord");
        discord.setVersion(21.213);
        discord.useTheApp(333);
        discord.download();
    }
}
