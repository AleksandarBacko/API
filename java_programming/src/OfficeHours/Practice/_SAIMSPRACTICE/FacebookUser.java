package OfficeHours.Practice._SAIMSPRACTICE;

import java.time.LocalTime;
import java.util.ArrayList;

public class FacebookUser extends SocialMedia implements hasGroups {
    public String username;
    public String password;
    public String fullName;
    public int age;
    public int numberOfFriends;
    public ArrayList<String> posts;
    public int numberOfGroups;

    @Override
    public void joinGroup(String group) {
        System.out.println(fullName+" has joined "+group);
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(fullName+" has leave "+group);
        numberOfGroups--;

    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        if(age>0&&(numberOfFriends>0&&numberOfFriends<5000)){
            this.age=age;
            this.numberOfFriends=numberOfFriends;
        }else {
            System.out.println("Invalid (age/number of friends) ");
            this.age=0;
            this.numberOfFriends=0;
        }
        if(password.contains(username)){
            setPassword("tryagainpassword");
            System.out.println("Password contained username. Default password created: "+getPassword());
        }else {
            setPassword(password);
        }
        for (int i = 0; i < fullName.length(); i++) {
            if((!(fullName.charAt(i)>=65)&&!(fullName.charAt(i)<=90))||(!(fullName.charAt(i)>=97)&&!(fullName.charAt(i)<=122))){
                System.out.println("invalid name");
                this.fullName="no name";
                break;
            }else {
                this.fullName=fullName;
            }

        }
    }


    public FacebookUser(String username,String password,String fullName){
        if(password.contains(username)){
            setPassword("tryagainpassword");
            System.out.println("Password contained username. Default password created: "+getPassword());
        }else {
            setPassword(password);
        }
        for (int i = 0; i < fullName.length(); i++) {
            if((!(fullName.charAt(i)>=65)&&!(fullName.charAt(i)<=90))||(!(fullName.charAt(i)>=97)&&!(fullName.charAt(i)<=122))){
                System.out.println("invalid name");
                this.fullName="no name";
                break;
            }else {
                this.fullName=fullName;
            }

        }
    }

    public FacebookUser(String username, String password) {
        if(password.contains(username)){
            setPassword("tryagainpassword");
            System.out.println("Password contained username. Default password created: "+getPassword());
        }else {
            setPassword(password);
        }
        personalURl="facebook.com/"+username;
        posts=new ArrayList<>();
    }

    static {
        platform="Facebook";
    }

    @Override
    public void directMessaging(String username, String message) {
        super.directMessaging(username, message);
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(String body) {
        super.post(body);
        posts.add(body);

    }

    @Override
    public void notifications() {
        super.notifications();
        int currentHourTime = LocalTime.now().getHour();

        if (currentHourTime >= 8 && currentHourTime <= 17) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public boolean sendFriendRequest(FacebookUser user){
        if (this.numberOfFriends==5000){
            System.out.println("You have reached the limit of friends.");
            return false;
        }if(user.numberOfFriends==5000){
            System.out.println(""+user.fullName+" cannot accept any more friend request");
            return false;
        }
        if (this.numberOfFriends<5000&&user.numberOfFriends<5000){
            this.numberOfFriends+=1;
            user.numberOfFriends+=1;
            System.out.println("Friend request sent to user " +user.fullName);
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                '}';
    }
}
