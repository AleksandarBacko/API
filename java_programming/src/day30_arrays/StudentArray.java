package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"1234", "adam", "li", "22", "8053123213"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname= " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);
        String[] student2 = {"1234", "adam", "li", "22", "8053123213"};
        if (student1.length == 5) {
            System.out.println("data array has correct length");
        } else {
            System.out.println("data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("NO PASS: data arrays length no match");
            ;
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        for (int i = 0; i < 5; i++) {
            System.out.println(student1[i]);


        }
    }
}

