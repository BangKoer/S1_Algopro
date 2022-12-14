/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8;

    // Paduan Antara Fungsi Dan Prosedur dalam 1 kelas
public class metodx {
    //Fungsi
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    //Volume Tabung
    public double volume_tabung(int diameter,int tinggi){
        metodx ut = new metodx ();
        double luas = ut.luas_lingkaran(diameter)*tinggi;
        return luas;
    }
    
    //Volume Kerucut
    public double volume_kerucut (int diameter, int tinggi){
        metodx uk = new metodx();
        double luas = (uk.luas_lingkaran(diameter)*tinggi)/3;
        return luas;
    }
    
    //Volume Bola
    public double volume_bola (int diameter, int tinggi){
        metodx ub = new metodx();
        int r = diameter/2;
        double luas = ub.luas_lingkaran(diameter)*r*(4/3);
        return luas;
    }
    
    // Prosedur
    public void hitungluasLingkaran (int jari2) {
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }
    
    public static void main(String[] args) {
        metodx mt = new metodx ();
        inputconsole ic = new inputconsole ();
        
//        //contoh
//        mt.hitungluasLingkaran(10);
//        System.out.print(mt.luas_lingkaran(20));
//        System.exit(0);
        
        //NO 1.b
        System.out.print("Diameter \t: ");
        int diameter = ic.readInt ();
        System.out.print("Tinggi \t\t: ");
        int tinggi = ic.readInt();
        
        System.out.println("========Hitung Volume Tabung========");
        System.out.println("Hasil : "+ mt.volume_tabung(diameter, tinggi));
        
        System.out.println("========Hitung Volume Kerucut========");
        System.out.println("Hasil : "+ mt.volume_kerucut(diameter, tinggi));
        
        System.out.println("========Hitung Volume Bola========");
        System.out.println("Hasil : "+ mt.volume_bola(diameter, tinggi));
    }
}
