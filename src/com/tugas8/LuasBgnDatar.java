
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8;

import javax.swing.JOptionPane;


public class LuasBgnDatar {
    public int hitungLuasPPanjang (int panjang, int lebar){
        int luas = panjang * lebar ;
        return luas;
    }
    
    public double hitungLuasSegitiga (int alas, int tinggi){
        double luas = (alas*tinggi)/2;
        return luas;
    }
    
    public double hitungLuaslingkaran (int jari2) {
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    } 
    
    // Memanggil
    public static void main(String[] args) {
        LuasBgnDatar ls = new LuasBgnDatar();
        
        System.out.println("==============Luas Persegi Panjang==============");
        int panjang = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Panjang"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Lebar"));
        
        System.out.println("Panjang \t: "+panjang);
        System.out.println("Lebar \t\t: "+lebar);
        System.out.println("Luas P.Panjang adalah : "+ls.hitungLuasPPanjang(panjang, lebar));
        
        System.out.println("==============Luas Segi Tiga==============");
        int alas = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Alas"));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan tinggi"));
        
        System.out.println("Alas \t: "+alas);
        System.out.println("Tinggi \t: "+tinggi);
        System.out.println("Luas Segitiga Adalah : "+ls.hitungLuasSegitiga(alas, tinggi));
        
        System.out.println("==============Luas Lingkaran==============");
        int jari = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Jari-jari"));
        
        System.out.println("Jari - Jari \t: "+jari);
        System.out.println("Luas Lingkaran Adalah : "+ls.hitungLuaslingkaran(jari));
    }
}
