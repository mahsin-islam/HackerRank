/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author mahsin
 */
public class HackerRank {

    public static int[] arrayLeftRotation(int[] nums,int n, int k) {
        k %= n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
        
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();

    }
}
