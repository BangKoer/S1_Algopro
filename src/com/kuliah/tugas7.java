/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Lenovo V14
 */
public class tugas7 {
    public static void main(String[] args) {
//        int [][] tabel = {{1,2,3,4},{5,6,7,8}};
//        System.out.println("Jumlah baris = "+tabel.length);
//        System.out.println("Jumlah Kolom = "+tabel[0].length);
//        for (int i = 0; i < tabel.length; i++) {
//            for (int j = 0; j < tabel[0].length; j++) {
//                System.out.print(tabel[i][j]+",");
//            } System.out.println("");
//        }
        
//        int data2[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
//        for (int a = 0; a < data2.length; a++) {
//            for (int b = 0; b < data2[0].length; b++) {
//                System.out.print(data2[a][b]+",");
//            } System.out.print("\n");
//        }
  

        // Nomor 2
        // Mencetak Iterasi Menggunakan While
        int data2 [][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int a = 0, jumlah = 0;
        while (a < data2.length){
            int b = 0;
            while (b < data2[0].length){
                System.out.print(data2[a][b]+",");
                jumlah += data2[a][b];
                b++;
            } System.out.println("");
                a++;
        } 
        //Mencetak Iterasi Menggunakan do
//           int a1 = 0;
//           do {
//           int b1 = 0;
//           do {
//               System.out.print(data2[a1][b1] + ",");
//               b1++;
//           }while (b1 < data2[0].length);
//           a1++;
//               System.out.println("");
//           }while (a1 < data2.length);
      
         // Menghitung Rata-rata
//        int c = data2[0].length + data2[1].length;
//        int d = jumlah/c;
//        System.out.println("Rata-Rata : "+d);

        //Mencari Posisi Element yang di Input
//        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai yang Dicari : "));
//        for (int brs = 0; brs < data2.length; brs++) {
//            for (int klm = 0; klm < data2[0].length; klm++) {
//                if (data2[brs][klm] == input){
//                    JOptionPane.showMessageDialog(null, "Angka :"+input+", Berada pada Baris : "+brs+", Kolom : "+klm);
//                }
//            }
//        }
        
        //Mengganti Nilai Array
//        int input2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Nilai yang dipilih : "));
//        int input3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Nilai Terbaru :"));
//        
//        for (int i = 0; i < data2.length; i++) {
//        System.out.print("Data terbaru :");
//            for (int j = 0; j < data2[0].length; j++) {
//                if (data2[i][j] == input2){
//                data2[i][j]= input3;
//                }System.out.print(data2[i][j]+",");
//            } System.out.println("");
//        }
//        
//        //Menjumlahkan Index Kolom Genap
//        int jumlah1 = 0;
//        for (int brs = 0; brs < data2.length; brs++) {
//            for (int klm = 0; klm < data2[0].length; klm++) {
//                if((klm-1) % 2 == 0){
//                    System.out.print("Index :"+data2[brs][klm]+", DiKolom Genap, ");
//                    jumlah1 += data2[brs][klm];
//                } 
//            } System.out.println("");
//        }
//         System.out.println("Total penjumlahan : "+jumlah1);       
                    
        
        
        // Nomor 3
//        String data [][] = {
//            {"ABDUL","Kediri","\t085646668991"},
//            {"KUSNO","Trenggalek","085646668992"},
//            {"PONIRAN","Bojonegoro","085646668999"}};
//        
//        System.out.println("================DATA================");
//        System.out.println("Nama\t\t Alamat\t\t\tTelepon");
//        
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                System.out.print(data[i][j]+"\t\t");
//            }System.out.println("");
//        }
         
        //Nomor 4
//        int angka [][] = {
//            {2,9,5,17},
//            {1,5,10,4}};
//        int jumlah = 0;
//        //Mencari Posisi Data angka 9 dan Menjumlahkannya
//        int inpt = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Angka yang cari"));
//        for (int i = 0; i < angka.length; i++) {
//            for (int j = 0; j < angka[0].length; j++) {
//                jumlah += angka[i][j];
//                if (angka[i][j] == inpt){
//                    JOptionPane.showMessageDialog(null, "Angka : "+inpt+", Berada pada Baris : "+(i+1)+", Kolom : "+(j+1));
//                }
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Jumlah seluruh nilai : "+jumlah);
        
        
        //Program Exception Sederhana
//        Scanner userInput = new Scanner (System.in);
//        
//        int data[] = {1,2,3,4};
//        System.out.print("Index Array ke : ");
//        int input = userInput.nextInt();
//        
//        try {
//            System.out.printf("Index array ke %d adalah %d",input,data[input]);
//        } catch(Exception e){
//         System.err.println("Index diluar data array");
//        } finally {
//            System.out.println("\nfinally");
//        }
//        
//        System.out.println("Ini Adalah akhir program");
    }
}
        


        
        
        
