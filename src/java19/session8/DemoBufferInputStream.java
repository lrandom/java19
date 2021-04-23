package java19.session8;

import java.io.*;

public class DemoBufferInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/mac/Desktop/data.txt");
            BufferedInputStream buf = new BufferedInputStream(fis);
            int data = 0;
            while((data=buf.read())>-1){
                System.out.println((char)data);
            }
            buf.close();
            fis.close();
        }catch (Exception e){

        }
    }
}
