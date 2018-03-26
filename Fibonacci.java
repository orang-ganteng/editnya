/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tampil = new Scanner(System.in);
        System.out.println("Input");
        int n = tampil.nextInt();
        long num[] = new long[n];
         
        num[0] = 0;
        num[1] = 1;
         
        for(int i = 2; i < n; i++) {
            num[i] = num[i-1] + num[i-2];
        }
        System.out.println("Output");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] +  " ");
        }
    }
    
}

//Chochoball mantap
