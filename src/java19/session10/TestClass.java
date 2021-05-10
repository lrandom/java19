package java19.session10;

public class
TestClass {
    public static void main(String[] args) {
        //tạo với lớp Thread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //tạo với runnable
        Thread t3 = new Thread(new MyThread2());

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();




    }
}
