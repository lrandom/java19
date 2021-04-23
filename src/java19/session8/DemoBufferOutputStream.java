package java19.session8;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class DemoBufferOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/mac/Desktop/file_output.txt");
            BufferedOutputStream buf = new BufferedOutputStream(fos);
            String sayMyName = "Slim Shady";
            buf.write(sayMyName.getBytes());
            buf.flush();
            buf.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
