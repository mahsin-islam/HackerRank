/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mahsin
 */
public class OddSum10783 {
    public static void main(String[] args) throws IOException  {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int count = 1;
    while(t > 0){
        int OddSum = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = a;i<=b;i++){
            if(i%2 != 0){
                OddSum = OddSum + i;
            }
        }
        System.out.println("Case "+count+": "+OddSum);
        count++;
        t--;
    }
    }
}
