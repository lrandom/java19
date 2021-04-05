package java19.session3;

import java.util.StringTokenizer;

public class DemoArr {
    public static void main(String[] args) {
        String names[] = new String[10]; //khai bao do dai mang
        names[0]="Luan";
        names[1]="Nam";
        names[2]="Le";

        String namess[] = new String[]{
                "Luan",
                "Nam",
                "Le"
        };

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        for (String name: names
             ) {
            System.out.println(name);
        }

        int arr2D[][] = new int[2][3]; //2 hàng 3 cột
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;

        int arr2D2[][] = new int[][]{
                {1,2,3},{3,4,5},{4,5,6}
        };

        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }

        String myName = "Luan";
        myName = "Nam";


        String myFullName = "Nguyen";
        String myFullName2 = "Nguyen";

        System.out.println(System.identityHashCode(myFullName));

        System.out.println(System.identityHashCode(myFullName2));

        StringTokenizer tokenizer = new StringTokenizer("a,b,c", ",", true);
        while(tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextElement());
        }
    }
}
