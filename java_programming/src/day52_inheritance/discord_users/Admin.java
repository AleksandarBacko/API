package day52_inheritance.discord_users;

public class Admin extends User{
    public Admin(){
        super();
    }

    public Admin(String name, String role, int id) {
        super(name, role, id);
    }

    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole()+ '\'' +
                ", id=" + getId() +
                '}';
    }
}
