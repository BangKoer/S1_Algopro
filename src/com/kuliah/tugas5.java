/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class tugas5 {
    public static void main(String[] args) {
        
                                    Scanner userInput = new Scanner (System.in);
                      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        //1.a
//        int jml = 0;
//        for (int i=1; i<=10;i++){
//        jml+=1;
//        }
//        System.out.println("Jumlah bilangan adalah :" + jml + "\n");
//        
//        //1.b
//        for(double jari = 1.0; jari<=2.0; jari+=0.2){
//            System.out.println("Radius = "+jari+" Luas = "+jari*Math.PI*jari);
//        } System.out.print("\n");
//        
//        //1.c
//        double r = 0;
//        while (r<0.99){
//            r = Math.random();
//            System.out.println("Tampilkan = "+r);
//        } System.out.print("\n");
//        
//        //1.d
//        double r1 = 0.0;
//        do{
//           r1 = Math.random();
//            System.out.println("Tampilkan = "+r1);
//        }while (r1<0.99d);
//        System.out.print("\n");
//        
//        //1.e
//        long batas = 4;
//        long faktorial = 1;
//        for (int i=0;i<=batas;i++){
//            faktorial = 1;
//            for (int faktor=2;faktor<=i; faktor++)
//                faktorial*=faktor;
//            System.out.println(i+"!"+" adalah = "+faktorial);
//        }
        
//        //2.a
//        int jml1 = 1;
//        int jml2 = 1;
//        
//        for (int i=1; i<=3;){
//        jml1*=4;
//        i++;
//        }
//        
//        for (int i=1; i<=2;){
//        jml2*=5;
//        i++;
//        }
//   
//        int jmltotal = jml1+jml2;
//        System.out.println("Jumlah bilangan adalah :" + jmltotal);
        
//        //2.b
//        int hasil1 = 1, hasil2 = 1, hasil = 0, a = 5, b = 4;
//        for (int i=a; i>0; i--){
//            hasil1 *=i;
//        }
//        
//        for (int i=b; i>0; i--){
//            hasil2 *=i;
//        }
//        
//        hasil = hasil1+hasil2;
//        System.out.println(a+"! + "+b+"! = " +hasil);

//        //2.c
//            //nilai A = 4
//            int jml1 = 1;
//        for (int i=1; i<=2;){
//        jml1*=4;
//        i++;
//        }
//        
//            //nilai B = 5
//            int jml2 = 1;
//        for (int i=1; i<=1;){
//        jml2*=5;
//        i++;
//        }
//
//        double total = (double)(jml1 + jml2)/jml2 +jml1;
//        System.out.println("Penjumlahan (4^2 + 5^1)/ 5^1 + 4^2 = "+total);
        
//        //3.a
//        
////        System.out.print("Masukkan Perulangan :");
////        int ulang = userInput.nextInt();
//        
//        String kata = "";
//        
//        
//        for (int i = 4; i >= 1 ; i--){
//            System.out.print("Masukkan Nilai Anda :");
//            int nilai = userInput.nextInt();
//        //statement If
//        if (nilai == 1){
//            kata = "Satu";
//        }else if (nilai == 2){
//            kata = "Dua";}
//        else if (nilai == 3){
//            kata = "Tiga";}
//        else if (nilai == 4){
//            kata = "Empat";}
//        else if (nilai == 5){
//            kata = "Lima";}
//        else if (nilai == 6){
//            kata = "Enam";}
//        else if (nilai == 7){
//            kata = "Tujuh";}
//        else if (nilai == 8){
//            kata = "Delapan";}
//        else if (nilai == 9){
//            kata = "Sembilan";}
//        else if (nilai == 10){
//            kata = "Sepuluh";}
//        else {
//            kata = "(Invalid Number)";
//        }
//        System.out.println("Nilai Yang di Input adalah " + kata);
//        }
//        
//        //3.b
//            for (int i = 4; i >=1; i--){
//             System.out.print("Masukkan Nilai Anda :");
//            int nilai = userInput.nextInt();
//        //statement Switch
//        switch (nilai) {
//            case 1:
//                System.out.println("Nilai input adalah Satu");
//                break;
//            case 2:
//                System.out.println("Nilai input adalah Dua");
//                break;
//            case 3:
//                System.out.println("Nilai input adalah Tiga");
//                break;
//            case 4:
//                System.out.println("Nilai input adalah Empat");
//                break;
//            case 5:
//                System.out.println("Nilai input adalah Lima");
//                break;
//            case 6:
//                System.out.println("Nilai input adalah Enam");
//                break;
//            case 7:
//                System.out.println("Nilai input adalah Tujuh");
//                break;
//            case 8:
//                System.out.println("Nilai input adalah Delapan");
//                break;
//            case 9:
//                System.out.println("Nilai input adalah Sembilan");
//                break;
//            case 10:
//                System.out.println("Nilai input adalah Sepuluh");
//                break;
//            
//            default:
//                System.out.println("Invalid Number");
//                break;
//                } 
//            }

//        //4.a
//            System.out.print("Masukkan Perulangan : ");
//            int ulang = userInput.nextInt();
//            int jumlah = 0;
//            for (int i = 0; i < ulang ; i++){
//            System.out.print("Masukkan Nilai Yang di ingin kan : ");
//            int nim = userInput.nextInt();
//            
//            jumlah += nim;
//            if (nim % 2 == 0){
//                System.out.println("Nilai Inputan berangka GENAP");
//            } else {
//                System.out.println("Nilai Inputan berangka GANJIL");
//            }
//           }
//            
//           System.out.println("\nJumlah = " + jumlah);
            
            
//        //4.b
//        String ulang,nim;
//        nim = "";
//        ulang = "";
//
//        ulang = JOptionPane.showInputDialog("Masukkan Perulangan : ");
//        
//        int k_ulang = Integer.parseInt(ulang);
//        
//        for (int i=0;i < k_ulang; i++){
//        nim = JOptionPane.showInputDialog("Masukkan Nim Anda");
//        long k_nim = Long.parseLong(nim);
//        if (k_nim % 2 == 0){
//        JOptionPane.showMessageDialog(null, "Nim Anda GENAP");
//        } else {
//        JOptionPane.showMessageDialog(null, "Nim Anda GANJIL");
//        } 
//       }

//        //5.a
        String angka = JOptionPane.showInputDialog("Masukkan Angka yang di Inginkan : ");
        int n = Integer.parseInt(angka);
        
        for (int i=1; i<=n; i++){       // mencetak baris
            for (int j=1; j<=i; j++){   // mencetak bintang
                System.out.print("*");
            }
            System.out.print("\t");
            for (int j=n; j>=i; j--){   
                System.out.print("*");
            }
           System.out.println(); 
        }
        
//        //5.b
//        String angka = JOptionPane.showInputDialog("Masukkan Angka yang di Inginkan : ");
//        int n = Integer.parseInt(angka);
//        
//        for (int i=1; i<=n; i++){       // mencetak baris
//            for (int j=n; j>=i; j--){   // mencetak bintang
//                System.out.print("*");
//            }
//            System.out.print("\t");
//            for (int j=n; j>=i; j--){   
//                System.out.print("*");
//            }
//           System.out.println(); 
//        }

        //====Tugas Pendahuluan Modul 6=====
        
           //contoh
//            int[] ages = {1,2,3,66,7,88,34,22,1};
//            for (int i=0; i<ages.length; i++){
//                System.out.println(ages[i]);
//            }
//            System.out.println("===================");
//            System.out.println(ages[2]);

//               int[][] nilai = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};
//               System.out.println("Masukkan nilai yang ingin dicari: ");
//               Scanner masukan = new Scanner(System.in);
//               int nilaiX = masukan.nextInt();
//               boolean benar = false;
//               for (int baris = 0; baris < nilai.length; baris++) {
//                    for (int kolom = 0; kolom < nilai.length; kolom++) {
//                       if (nilai[baris][kolom] == nilaiX) {
//                          System.out.println("Angka : " + nilaiX + "\nberada pada baris : " + baris + "\nkolom : " + kolom);
//                          benar = true;
//                       }
//                      }
//                    }
               

           //4.a
//           int data[] = {4,6,4,2,8,4,2,11};
//           String input = JOptionPane.showInputDialog("Masukkan Nilai Element : ");
//           int k_inp = Integer.parseInt(input);
//           for (int baris = 0; baris < data.length;baris++){
//               if (data [baris] == k_inp){
//                JOptionPane.showMessageDialog(null, "Angka : "+input+" berada pada baris : "+baris);
//               }
//           }
           
//           // While
//           int a = 0;
//           while (a < data.length){
//               System.out.print(data [a] +",");
//               a++;
//           }
//           System.out.println("");
//           // Do-While
//           int b = 0;
//           do {
//               System.out.print(data [b] +",");
//               b++;
//           }while (b < data.length);
//           System.out.println("");
//           // For-loop
//           for (int c = 0; c < data.length; c++){
//               System.out.print(data [c] +",");
//           }
    }
}
