package java19.session7;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("hihi 1");
            System.out.println(a/b);
        }catch (Exception exception){
            System.out.println("Thơm hơn chưa");
            //exception.printStackTrace();
        }



        //while(true){
            System.out.println("Vui long nhap so");
            Scanner sc = new Scanner(System.in);
            try {
                int num = sc.nextInt();
                System.out.println(a/b);
            } catch (InputMismatchException e) {
                System.out.println("Ban dien loi roi, loi tn thi lam an gi");
            } catch (ArithmeticException e1){
                System.out.println(e1);
            } catch (Exception e){

            }


        //}

        //System.out.println("hi hi");
    }
}
