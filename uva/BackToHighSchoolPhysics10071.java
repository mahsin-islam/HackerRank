/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva;

import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author mahsin
 */
public class BackToHighSchoolPhysics10071 {
    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int v = in.nextInt();
            int t = in.nextInt();
            System.out.println(2*v*t);
        }
    }    
}
