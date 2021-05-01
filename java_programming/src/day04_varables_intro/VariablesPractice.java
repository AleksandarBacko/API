package day04_varables_intro;

public class VariablesPractice {
    public static void main(String[] args) {
        // declare variable students that stores number
        int students;
        students = 400;
        System.out.println(students);//400
        students = 70;
        System.out.println(students);//70

        students = 250;
        students = 333;
        System.out.println(students);

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teachers: ");
        System.out.println(teachers);
        System.out.println("Number of teachers is: "+ teachers);
        System.out.print("Number of mentors: ");
        System.out.println(mentors);
        System.out.println(mentors);


        int job1,job2,job3;
        job1=10;
        job2=17;
        job3=40;
        int jobTotal= job1 + job2 + job3;
        System.out.println(jobTotal);

        int trip1=20 , trip2=30 ,trip3= 45;
        int triptotal= trip1 + trip2 + trip3;
        System.out.println(triptotal);

    }
}
