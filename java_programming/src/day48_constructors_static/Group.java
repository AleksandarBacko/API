package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<String> members=new ArrayList<>();


    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }


    public void addMember(String newMember){
        members.add(newMember);
    }
    public void remuveMember(String newMember){
        members.remove(newMember);
    }
}
