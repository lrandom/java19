package java19.session10;

public class
MyThread  extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0 ; i<10; i++){
            System.out.println(i);
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
