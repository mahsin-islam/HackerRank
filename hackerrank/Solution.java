/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author mahsin
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int maxTurns;
        maxTurns  = (int)Math.floor(n/2);
        int turnsFromFront  = (int)Math.floor(p/2);
        System.out.println(Math.min(turnsFromFront, maxTurns - turnsFromFront));
    }
}
