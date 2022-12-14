/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Lenovo V14
 */
public class tugas4 {
    public static void main(String[] args) {
                            Scanner userInput = new Scanner (System.in);
                            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        //Percobaan ke 12
//        System.out.println("=========Modul 3==========");
//        String a, b, c;
//        a = "";
//        b = "";
//        c = "";
//        try{
//            System.out.print("Masukkan nilai A : ");
//            a = dataIn.readLine();
//            System.out.print("Masukkan nilai B : ");
//            b = dataIn.readLine();
//            System.out.print("Masukkan nilai C : ");
//            c = dataIn.readLine();
//            
//            System.out.println("Hasil Nilai yang di Input : " +a+", "+b+", "+c);
//            } 
//             catch(IOException e){
//            System.out.println("Error");
//            }
        
//        //Percobaan ke 15
//        System.out.println("=========Modul 4 Baru (Nomor 2)==========");
//        String a, b, c;
//        a = "";
//        b = "";
//        c = "";
//        try{
//            System.out.print("Masukkan nilai A : ");
//            a = dataIn.readLine();
//            System.out.print("Masukkan nilai B : ");
//            b = dataIn.readLine();
//            System.out.print("Masukkan nilai C : ");
//            c = dataIn.readLine();
//            
//            int ka = Integer.parseInt(a);
//            int kb = Integer.parseInt(b);
//            int kc = Integer.parseInt(c);
//            int kbesar, kkecil;
//            
//            //nilai besar
//          if (ka > kb && ka > kc){
//              kbesar = ka;
//          }else if (kb > ka && kb > kc){
//              kbesar = kb;
//          }else {
//              kbesar = kc;
//          } 
//          //nilai kecil
//           if (ka < kb && ka < kc){
//               kkecil = ka;
//           }else if (kb < ka && kb < kc){
//               kkecil = kb;
//           }else {
//               kkecil = kc;}
//            
//            System.out.println("Hasil Nilai yang di Input : " +a+", "+b+", "+c);
//            System.out.println("Nilai Terbesar adalah : "+kbesar+"\nNilai Terkecil adalah : "+kkecil );
//            } 
//             catch(IOException e){
//            System.out.println("Error");
//            }
        
            
//         // Percobaan Ke 16
//         System.out.println("=========Modul 4 Baru (Nomor 3)==========");
//         
//         String bjual = JOptionPane.showInputDialog("Masukkan Pendapatan : ");
//         double konfers_jl = Double.valueOf(bjual);
//         double hasil;
//         if (konfers_jl <= 2000000){
//             hasil = 100000 + (konfers_jl*0.1);
//             JOptionPane.showMessageDialog(null, "Komisi Anda Adalah " + hasil);
//         } else if (konfers_jl > 2000000 && konfers_jl < 5000000){
//             hasil = 200000 + (konfers_jl*0.15);
//             JOptionPane.showMessageDialog(null, "Komisi Anda adalah " + hasil);
//         } else if (konfers_jl > 5000000){
//             hasil = 300000 + (konfers_jl*0.2);
//             JOptionPane.showMessageDialog(null, "Komisi Anda adalah " + hasil);
//         }
         
         
//           // Percobaan Ke 17
//           System.out.println("=========Modul 4 Baru (Nomor 4)==========");
//           
//           int n_adi = 70, n_budi = 65, n_caca = 90, n_deny = 75;
//           int n_max = 0;
//           int n_min = 0;
//           
//           String adi,budi,caca,deny;
//           adi = "Nilai Adi : ";
//           budi = "Nilai Budi : ";
//           caca = "Nilai Caca : ";
//           deny = "Nilai Deny : ";
//           
//           
//           //predikat A
//           if (n_adi>86 && n_adi<=100){System.out.println(adi+n_adi+" A");}
//           if (n_budi>86 && n_budi<=100){System.out.println(budi+n_budi+" A");}
//           if (n_caca>86 && n_caca<=100){System.out.println(caca+n_caca+" A");}
//           if (n_deny>86 && n_deny<=100){System.out.println(deny+n_deny+" A");}
//           
//           //predikat B+
//           if (n_adi>=76 && n_adi<=85){System.out.println(adi+n_adi+" B+");}
//           if (n_budi>=76 && n_budi<=85){System.out.println(budi+n_budi+" B+");}
//           if (n_caca>=76 && n_caca<=85){System.out.println(caca+n_caca+" B+");}
//           if (n_deny>=76 && n_deny<=85){System.out.println(deny+n_deny+" B+");}
//           
//           //predikat B
//           if (n_adi>=66 && n_adi<=75){System.out.println( adi+n_adi+" B");}
//           if (n_budi>=66 && n_budi<=75){System.out.println(budi+n_budi+" B");}
//           if (n_caca>=66 && n_caca<=75){System.out.println(caca+n_caca+" B");}
//           if (n_deny>=66 && n_adi<=75){System.out.println(deny+n_deny+" B");}
//           
//           //predikat C+
//           if (n_adi>=56 && n_adi<=65){System.out.println(adi+n_adi+" C+");}
//           if (n_budi>=56 && n_budi<=65){System.out.println(budi+n_budi+" C+");}
//           if (n_caca>=56 && n_caca<=65){System.out.println(caca+n_caca+" C+");}
//           if (n_deny>=56 && n_deny<=65){System.out.println(deny+n_deny+" C+");}
//           
//           //predikat C
//           if (n_adi>=46 && n_adi<=55){System.out.println(adi+n_adi+" C");}
//           if (n_budi>=46 && n_budi<=55){System.out.println(budi+n_budi+" C");}
//           if (n_caca>=46 && n_caca<=55){System.out.println(caca+n_caca+" C");}
//           if (n_deny>=46 && n_deny<=55){System.out.println(deny+n_deny+" C");}
//           
//           //predikat D
//           if (n_adi>=36 && n_adi<=45){System.out.println(adi+n_adi+" D");}
//           if (n_budi>=36 && n_budi<=45){System.out.println(budi+n_budi+" D");}
//           if (n_caca>=36 && n_caca<=45){System.out.println(caca+n_caca+" D");}
//           if (n_deny>=36 && n_deny<=45){System.out.println(deny+n_deny+" D");}
//           
//           //nilaimaximal
//           if (n_adi>n_budi && n_adi>n_caca && n_adi>n_deny){n_max = n_adi;}
//           if (n_budi>n_adi && n_budi>n_caca && n_budi>n_deny){n_max = n_budi;}
//           if (n_caca>n_budi && n_caca>n_adi && n_caca>n_deny){n_max = n_caca;}
//           if (n_deny>n_budi && n_deny>n_caca && n_deny>n_adi){n_max = n_deny;}
//           
//           //nilaiminimal
//           if (n_adi<n_budi && n_adi<n_caca && n_adi<n_deny){n_min = n_adi;}
//           if (n_budi<n_adi && n_budi<n_caca && n_budi<n_deny){n_min = n_budi;}
//           if (n_caca<n_budi && n_caca<n_adi && n_caca<n_deny){n_min = n_caca;}
//           if (n_deny<n_budi && n_deny<n_caca && n_deny<n_adi){n_min = n_deny;}
//           
//           System.out.println("Nilai Terbesar adalah :" + n_max);
//           System.out.println("Nilai Terkecil adalah :" + n_min);
//          
//            // Percobaan Ke 17
//         System.out.println("=========Modul 5 Baru (Nomor 2) Pendahuluan==========");
//           // While Loop
           int a = 10,jumlah = 0;
//           System.out.print("Nilai Perulangan Dengan Metode While Loop \t= ");
//           while (a >= 0){
//               System.out.print(a + ",");
//               jumlah += a;
//               a--;
//               }
//           System.out.println("\nJumlah = " + jumlah);
//           
           // For Loop
           System.out.print("\nNilai Perulangan Dengan Metode For Loop \t= ");
           for (a = 0 ,jumlah = 0; a <= 10;){
               System.out.print(a + ",");
               jumlah += a;
               a++;
               }
           System.out.println("\nJumlah = " + jumlah);
//           
//           // Do-While
//           jumlah = 0;
//           System.out.print("\nNilai Perulangan Dengan Metode Do Loop   \t= ");
//           do{
//               System.out.print(a+",");
//               jumlah += a;
//               a--;
//           }while (a >= 0);
//           System.out.println("\nJumlah = " + jumlah);
//           
//           
           
         
    }
}
