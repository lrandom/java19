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
public class JumStatment {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
