/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uts;
import javax.swing.JOptionPane;

public class UTS {
    public static void main(String[] args) {
        
        //No.1//
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
            
          //No.2//
          System.out.println("\n=======================================");
          System.out.print("Berikut Ialah Urutan Bilangan : ");
          for (int i = 1; i <= 20; i++) {
              System.out.print(i+",");
        }System.out.println();
        System.out.print("Bilangan Ganjil : ");
        for (int i = 1; i <= 20; i++) {
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }System.out.println("");
        System.out.print("Bilangan Genap : ");
        for (int i = 1; i <= 20; i++) {
            if(i%2 == 0){
                System.out.print(i+",");
            }
        }System.out.println("");
//        
//         //No.3//
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

         
         
         
         


