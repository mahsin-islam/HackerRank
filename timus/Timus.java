/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timus;

import java.util.Scanner;

/**
 *
 * @author mahsin
 */
public class Timus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if(n < 0){
            sum = ((n*(n-1))/2)*(-1);
        sum = sum + 1;
        } else {
            for (int i = 2; i <= n; i++) {
                sum = sum + i; 
            }
        }
        System.out.println(sum);
    }
    
}
