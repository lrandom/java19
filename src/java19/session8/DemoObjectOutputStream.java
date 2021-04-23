package java19.session8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoObjectOutputStream {
    public static void main(String[] args) {
        try {
            Dragon toothless = new Dragon();
            toothless.setName("toothLess");
            toothless.setType("European Dragon");
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("/Users/mac/Desktop/object_data.txt"));
            //Ghi object vào file
            objectOutputStream.writeObject(toothless);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
