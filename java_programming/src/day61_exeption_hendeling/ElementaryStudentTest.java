package day61_exeption_hendeling;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent student=new ElementaryStudent();
            student.setName("bob");
            student.setAge(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
