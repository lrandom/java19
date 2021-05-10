package java19.session10;

public class Person {
    public synchronized void wakeup(){
        System.out.println("I am wake up");
    }

    public synchronized void working(){
        System.out.println("I am working");
        try {
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("I am continue working");
    }

    public synchronized void breakfast(){
        System.out.println("I get breakfast");
        try {
            notify();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
