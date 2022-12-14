/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uts;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo V14
 */
public class no1 {
    public static void main(String[] args) {
        int v=0, bp = 0, bs = 0, pt = 0;  //voucher,bonuspulsa,bonusSMS,pulsatotal
        System.out.println("\t==========VOUCHER PULSA==========");
        System.out.println("1. Voucher Rp150.000\n2. Voucher Rp100.000\n3. Voucher Rp50.000\n4. Voucher Rp25.000 ");
        
        int pilih = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Nominal Voucher yg di Inginkan :"));
        System.out.println("Nominal Voucher yang dibeli : "+pilih);
        
        if (pilih == 150000){
            v=150000;bp=15000;bs=150;pt = v+bp;
        } 
        else if (pilih == 100000){
            v=100000;bp=10000;bs=100;pt = v+bp;}
        else if (pilih == 50000){
            v=50000;bp=0;bs=50;pt = v+bp;}
        else if (pilih == 25000){
            v=25000;bp=0;bs=0;pt = v+bp;}
        else {JOptionPane.showMessageDialog(null, "Invalid Input");}
       
        if (pilih >= 25000 && pilih <=150000){
         System.out.println("\t============MESSAGE============");
            System.out.println("Selamat Anda !!! Berhasil Melakukan Isi ulang pulsa Rp"+v+"\nAnda "
                    + "Mendapatkan Bonus Pulsa : "+bp+", Bonus SMS : "+bs+" SMS");
            System.out.println("Pulsa awal : "+pilih+"\nTotal Pulsa Anda Saat Ini :"+(v+bp));
        } else {System.out.println("");
            System.out.println("Invalid Input");}
    }
}
