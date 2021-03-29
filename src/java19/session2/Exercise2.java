/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19.session2;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Exercise2 {
    public static void main(String[] args) {
        int num1,num2,choice;
        float result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat");
        num1 = sc.nextInt();
        System.out.println("Nhap vao so thu hai");
        num2 = sc.nextInt();
        
        System.out.println("Vui long cho biet lua chon");
        System.out.println("1-Phep cong");
        System.out.println("2-Phep tru");
        System.out.println("3-Phep nhan");
        System.out.println("4-Phep chia");
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Bạn chon phep cong");
                result = num1 + num2;
                break;
            
            case 2:
                System.out.println("Bạn chon phep tru");
                result = num1 - num2;
                break;
                
            case 3:
                System.out.println("Bạn chon phep nhan");
                result = num1*num2;
                break;
                
            case 4:
                System.out.println("Bạn chon phep chia");
                result = num1/num2;
                break;
        }
        
        System.out.println("Ket qua la "+result);
        
    }
}
