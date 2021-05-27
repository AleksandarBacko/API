package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//firstName, age
public class Person {
  String firstName;
  int age;
  char gender;
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People{
    public static void main(String[] args) {
        Person name1=new Person();
        name1.firstName="bob";
        name1.age=25;
        name1.gender='M';
        name1.speak();
        System.out.println(name1.firstName+ " "+ name1.age+" "+ name1.gender);


        Person name2=new Person();
        name2.firstName="aleks";
        name2.age=55;
        name2.gender='M';
        name1.speak();
        System.out.println(name2.firstName+ " "+ name2.age+" "+ name2.gender);

        List<String> names= new ArrayList<>(Arrays.asList((name1.firstName), (name2.firstName)));
        List<Integer > age= new ArrayList<>();
        age.add(name1.age);
        age.add(name2.age);
        System.out.println("Names in list : "+ names+"\n"+"Age of persons : "+age);
        List<Character> gen= new ArrayList<>(Arrays.asList((name1.gender), (name2.gender)));
        System.out.println("Gender in list : "+gen);




    }
}
