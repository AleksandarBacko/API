package OfficeHours.Practice._SAIMSPRACTICE;

public class FaceBookObject {
    public static void main(String[] args) throws InterruptedException {
        FacebookUser user=new FacebookUser("dsnjad","sdkmals");
        System.out.println(user);

        FacebookUser user1=new FacebookUser("sdams,dsad","daisdoii","Adssaddasd");
        System.out.println(user1);


        user.sendFriendRequest(user1);
        System.out.println(user);
        System.out.println(user1);
        user.post("this is first post");
        System.out.println(user);
        user.post("second post");
        System.out.println(user);
        user.notifications();
        Thread.sleep(10000);
        user.notifications();
    }
}
