package java19.session8;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnn-imgs-f.vgcloud.vn/2020/08/24/19/xe-tang-viet-nam-tung-hoanh-thi-dau-tai-nga-2-600x400.jpg");
            URLConnection conn = url.openConnection();
            InputStream inputStream =  conn.getInputStream();//trả về một stream
            BufferedOutputStream buf = new BufferedOutputStream(new FileOutputStream("/Users/mac/Desktop/spotify/VietNam_vo_dich.jpg"));
            BufferedInputStream bif = new BufferedInputStream(inputStream);
            int data = 0;
            while((data=bif.read())!=-1){
                buf.write(data);
            }
            buf.flush();
            buf.close();
            bif.close();
        }catch (Exception e){

        }
    }
}
