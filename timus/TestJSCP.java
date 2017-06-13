/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timus;

import java.time.LocalDate;

/**
 *
 * @author mahsin
 */
public class TestJSCP {
     public static void main(String[] args){
         int x = 3;
         int y = ++x*4/x-- + --x;
         System.out.println("y + x is" + (y+x));
 }
}
