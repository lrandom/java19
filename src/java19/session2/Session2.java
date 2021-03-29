/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java19.session2;

/**
 *
 * @author Lrandom
 */
public class Session2 {
    public static void main(String[] args) {
        String weather = "mua";
        if(weather.equals("mua")){
            System.out.println("Đi xem phim");
        }
        
        if(weather.equals("nang")){
            System.out.println("o nha");
        }
        
        /*int age = 10;
        if(age>=18){
            System.out.println("Bạn đủ tuổi cưới vợ");
        }else{
            System.out.println("Bạn tuổi gì");
        }*/
        
        int age = 30;
        
        if(age <= 5){
            System.out.println("Bạn còn tuổi mẫu giáo");
        }else if(age>5 && age <13){
            System.out.println("Bạn còn tuổi nhi đồng");
        }else if(age>13 && age <18){
            System.out.println("Bạn còn tuổi thanh thiếu niên");
        }else if(age>=18 && age <=35){
            System.out.println("Bạn còn tuổi thanh niên");
        }else if(age>35 && age <=50){
            System.out.println("Bạn đến tuổi trung niên");
        }
        
        
        if(age <=30){
           if(age <= 20){
              if(age <=10){
                  System.out.println("Bạn là nhi đồng");
              }
           }
        }
        
        int numericMonth = 1;
        switch(numericMonth){
            case 1:
                System.out.println("Thang 1");
                break;
                
            case 2:
                System.out.println("Thang 2");
                break;
                
            case 3:
                System.out.println("Thang 3");
                break;
            
            default:
                System.out.println("Khong tim thay thang nao ca");
                break;           
        }
    }
}
