package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1=new Group("Cyberbugs");//dependency injectin

        System.out.println(group1.getMembers().size());

        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Ali");
        group1.addMember("Elvin");
        group1.addMember("Parvin");
        group1.addMember("Rasim");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());


        Group group2=new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen","Wakshum","Akrem","Bulent","Andrea"));
        System.out.println(group2.getMembers());
        if(group2.getMembers().contains("Akrem")){
            System.out.println("he is in group");
        }else {
            System.out.println("he is not in group");
        }





    }
}
