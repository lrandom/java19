package java19.session10;

public class Test3Class {
    public static void main(String[] args) {
        Person person = new Person();
        Thread t1 = new Thread(){
            public void run(){
                person.wakeup();
                person.working();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                person.breakfast();
            }
        };

        t1.start();
        t2.start();
    }
}
