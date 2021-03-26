/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Java19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hello World");
        int age = 29;
        String name = "Nguyen Thanh Luan";
        String homeTown = "Quang Ninh";
        
        System.out.printf("My age %d %d",age,10); //My age 29
        System.out.println("My age "+age); //My age 29*/
        /*System.out.println("Please type any number");
        Scanner scanner = new Scanner(System.in);
        int yourChoiceNumber =  scanner.nextInt();
        System.out.println("You type "+yourChoiceNumber);
        
        scanner.nextLine();
        
        String yourAddress = scanner.nextLine();//tiếp nhận giá trị kiểu chuỗi
        System.out.println("You type "+yourAddress);*/
        
        /*System.out.println("My name is \"Luan\""); //My name is "Luan"
        System.out.printf("\n \t");
        
        int count = 0;
        System.out.println(count++); //0
        System.out.println(++count); //1
        
        boolean flag = true;
        boolean flagTwo = !flag; //false
        
        boolean flagThree = (10!=11)?true : false; //true trinary 
        
        //chuyen tuong minh 
        long number = 1000;
        int numberInt = (int)number;
        
        //chuyen ngam dinh 
        int numberIntTwo = 1000;
        long numberLongTwo = numberIntTwo;*/
        
        /*2, Viết chương trình nhập vào 3 số 
            tìm số lớn nhất và in ra màn hình*/
        
        int a,b,c,max; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so 1");
        a = scanner.nextInt();
        System.out.println("Nhap so 2");
        b = scanner.nextInt();
        System.out.println("Nhap so 3");
        c = scanner.nextInt();
        
        max = a ;//gán số đầu tiên là max
        if(max<b){
            max = b;
        }
        
        if(max<c){
            max = c;
        }
        
        System.out.println("So lon nhat la "+ max);
    } 
}
