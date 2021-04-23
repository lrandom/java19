package java19.session8;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DemoFIleWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/mac/Desktop/file_output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String name = "Ha Noi";
            bufferedWriter.write(name);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
