/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8;

    //No.1
    // Method Tanpa nilai kembalian
public class persegi {
        public void segiempat (int panjang, int lebar){
        double luas;
        double keliling;
        luas = panjang * lebar;
            System.out.println("------------------------------");
            System.out.println("Panjang Segi Empat :\t "+ panjang);
            System.out.println("Lebar Segi Empat :\t "+ lebar);
            System.out.println("Luas Segi Empat :\t "+ luas);
        }
        public static void main(String[] args) {
            persegi se = new persegi();
            se.segiempat (10,5);
        }
}
