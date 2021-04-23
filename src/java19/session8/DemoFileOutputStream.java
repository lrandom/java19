package java19.session8;

import java.io.FileOutputStream;

public class DemoFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/mac/Desktop/file_output.txt");
            String name = "Luan";

            //đẩy vào bộ nhớ đệm
            fos.write(name.getBytes());

            //đẩy dữ liệu vào ổ cứng
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
