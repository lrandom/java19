package java19.session8;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/mac/Desktop/spotify/");
            File[] files = file.listFiles();
            for (File subFile : files
            ) {
                System.out.println(subFile.getName());
            }
            //tạo mới folder
            File subFile = new File("/Users/mac/Desktop/spotify/test");
            if (!subFile.exists() && !subFile.isDirectory()) {
                //tạo một một folder
                subFile.mkdir();
            }
        } catch (Exception ex) {

        }
    }
}
