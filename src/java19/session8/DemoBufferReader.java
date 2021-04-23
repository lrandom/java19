package java19.session8;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoBufferReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/mac/Desktop/data.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String content = null;
            while ((content = bufferReader.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
