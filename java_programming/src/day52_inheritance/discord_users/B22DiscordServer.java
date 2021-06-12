package day52_inheritance.discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
     User user1=new User();
     user1.setName("Suleyman");
     user1.setRole("Student");
     user1.setId(230);
        System.out.println(user1);
        System.out.println();
        System.out.println();

        Admin admin=new Admin();
        admin.setId(1);
        admin.setName("murodil");
        admin.setRole("admin");
        System.out.println(admin);

        System.out.println();
        System.out.println();


        User user2=new User("dasd","dasda",22);
        System.out.println(user2);
        System.out.println();
        System.out.println();

        Admin admin1=new Admin("dsaddsd","dsadnkm",33);
        System.out.println(admin1);
    }
}
