package java19.session4.exercise2;

import java.util.Scanner;

public class ClassRoom {
    private String name;
    private int numberOfStudent;
    private Student[] students;

    public ClassRoom(String name, int numberOfStudent, Student[] students) {
        this.name = name;
        this.numberOfStudent = numberOfStudent;
        this.students = new Student[numberOfStudent];
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student findStudentById(String studentId){
        for (Student student: students
             ) {
            if(student.getStudentId().equalsIgnoreCase(studentId)){
                return student;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int numberOfStudent = 2;
        Student nam = new Student();
        nam.setStudentId("001");
        nam.setName("Nam");
        nam.setAddress("Ha Noi");
        nam.setPhone("086823848");

        Student nu = new Student();
        nu.setStudentId("002");
        nu.setName("Nu");
        nu.setAddress("Quang Ninh");
        nu.setPhone("08682737");

        Student[] students = new Student[]{
                nam,
                nu
        };

        //Khoi tao lop hoc
        ClassRoom classRoom = new ClassRoom("Java19", 2, students);
        System.out.println("Xin moi nhap ma hoc sinh");
        Scanner sc = new Scanner(System.in);
        String studentId = sc.nextLine();
        System.out.println("Kết quả tìm kiếm");
        Student foundStudent = classRoom.findStudentById(studentId);
        if(foundStudent==null){
            System.out.println("Khong tìm thấy học sinh");
        }else{
            System.out.println("Tìm thấy học sinh");
            System.out.println("Name"+foundStudent.getName());
            System.out.println("Address"+foundStudent.getAddress());
            System.out.println("Phone"+foundStudent.getPhone());
        }
    }
}
