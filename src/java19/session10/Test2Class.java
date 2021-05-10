package java19.session10;

public class
Test2Class {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Thread student1 =new Thread(){
            public void run(){
                teacher.teaching(5);
            }
        };

        Thread student2 = new Thread(){
            public void run(){
                teacher.teaching(15);
            }
        };

        student1.start();
        student2.start();
    }

}
