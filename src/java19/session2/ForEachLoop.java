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
public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for (int num : nums) {
            System.out.println(num);
        }
        
        /*for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/
    }
}
