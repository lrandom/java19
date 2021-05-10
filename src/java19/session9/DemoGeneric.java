package java19.session9;

import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        //Không dùng generic
        ArrayList arr = new ArrayList();
        arr.add(new Float(10000));
        Animal animal = (Animal)arr.get(0);

        //Dùng generic
        ArrayList<Float> arr2 = new ArrayList<>();
        arr.add(new Float(1000));
        Float number2= arr2.get(0);


    }
}
