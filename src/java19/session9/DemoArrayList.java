package java19.session9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        arr.add("Nam");
        arr.add("Luan");
        arr.add("Linh");

        arr.get(0);//Nam

        for (int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        for (String name:
             arr) {
            System.out.println(name);
        }

        //arr.remove(0);
        HashMap<String,Integer> hashMap =new HashMap<>();
        hashMap.put("Luan", 29);
        hashMap.put("Nam", 20);

        hashMap.get("Luan"); //lấy theo key Luan tra ve 29
        hashMap.get("Nam");//lay theo key Nam tra ve 20

        //Duyệt hash map
        Iterator it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }


        //duyệt bằng for-each
        for (
             Map.Entry<String,Integer> it2: hashMap.entrySet() ) {
            System.out.println(it2.getKey());
            System.out.println(it2.getValue());
        }

    }
}
