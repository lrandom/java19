package java19.session9;

import java.util.ArrayList;

public class JS19 {
  public void setPerson(ArrayList<? extends Person> person){
     //Student student = (Student) person;
     //Teacher teacher= (Teacher) person;
     //student.sayStudentName();
     //teacher.sayTeacherName();
      //ArrayList<Student> students = new ArrayList<>();

  }

    public static void main(String[] args) {
        JS19 js19 = new JS19();
        ArrayList<Student> students = new ArrayList<>();
        js19.setPerson(students);
        //js19.setPerson(new Student());
        //js19.setPerson(new Teacher());
    }
}




