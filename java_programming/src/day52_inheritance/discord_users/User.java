package day52_inheritance.discord_users;

public class User {
   private String name;
   private String role;
   private int id;

    public User() {
        System.out.println("user class constructor no args called ");
    }

    public User(String name, String role, int id) {

        System.out.println("user class constructor with args called");
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }
}
