package OfficeHours.Practice._SAIMSPRACTICE;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures{
    public String username;
    public String password;
    public int numberOfFollowers;
    public int numberOfFollowing;
    public ArrayList<String> posts;
    static {
        platform="Instagram";
    }

    public Instagram(String username,String password){
        this.username=username;
        this.password=password;
        personalURl = "Instagram.com/" + username;

    }

    @Override
    public void likePicture() {
        System.out.println("like picture");
    }

    @Override
    public void unlikePicture() {
        System.out.println("unlike picture");
    }

    @Override
    public void sharePicture() {
        System.out.println("share picture");
    }

    @Override
    public void directMessaging(String username, String message) {
        super.directMessaging(username, message);
        System.out.println(message+" sent to "+username);
    }

    @Override
    public void post(String body) {
        super.post(body);
        String pic="\u202AC:\\Users\\backo\\Desktop\\200896649_240599294116898_4034881604417346963_n.jpg";
        posts.add(pic);
    }

    @Override
    public void notifications() {
        super.notifications();
        int currentHourTime = LocalTime.now().getHour();

        if (currentHourTime >= 10 && currentHourTime <= 20) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }
}
