package day54_abstraction;

public abstract class Student {
    public void code(String lenguage){
        System.out.println("Student is coding using "+lenguage);
    }
    public abstract void attendClass();
}
class online extends Student{
   @Override
    public void attendClass(){
        System.out.println("attend from kitchen online");
    }
}
class inSchool extends Student{
    @Override
    public void attendClass(){
        System.out.println("covid 19 mess it up :D ");
    }
}

class School{

    public static void main(String[] args) {
        online  studentOne=new online();
        studentOne.attendClass();

        inSchool studentTwo= new inSchool();
        studentTwo.attendClass();
    }

}
