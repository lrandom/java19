package java19.session10;

public class Teacher {
    //hàm đồng bộ
    synchronized void teaching(int offset){
        for (int i = 0; i<10; i++){
            System.out.println(i+offset);
            try {
                 Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
