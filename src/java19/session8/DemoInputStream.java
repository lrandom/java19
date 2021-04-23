package java19.session8;

import java.io.File;
import java.io.FileInputStream;

public class DemoInputStream {
    public static void main(String[] args) {
        try {
            //Mở luồng
            FileInputStream fis = new FileInputStream("/Users/mac/Desktop/data.txt");
            int data = 0 ;
            while((data=fis.read())!=-1){
                //đọc dữ liệu và in ra màn hình
                System.out.println((char)data);
            }

            //Đóng luồng
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
