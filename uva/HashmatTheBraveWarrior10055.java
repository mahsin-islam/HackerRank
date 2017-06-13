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
public class HashmatTheBraveWarrior10055 {
    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long a = in.nextLong();
            long b = in.nextLong();
            if(a>b){
                a = a - b;
            }else{
                a = b - a;
            }
            System.out.println(a);
        }
    }
}
