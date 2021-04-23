package java19.session8;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoObjectInputStream {
    public static void main(String[] args) {
        try {
            ObjectInputStream fis =
                    new ObjectInputStream(new FileInputStream("/Users/mac/Desktop/object_data.txt"));
            Dragon toothless = (Dragon) fis.readObject();
            System.out.println(toothless.getName());
            System.out.println(toothless.getType());
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
