/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uts;

/**
 *
 * @author Lenovo V14
 */
public class no3 {
    public static void main(String[] args) {
                 System.out.println("\n=======================================");
         System.out.println("=====Loop Pola=====");
         for (int i = 1; i <= 5; i++) {
             for (int j = 4; j >= i; j--) {
                 System.out.print(" ");}
                 for (int k = 1; k <= i; k++) {
                     System.out.print("*");}
                 for (int l = 1; l <= i-1; l++) {
                     System.out.print("*");}
                        System.out.println("");
             }
    }
}
