/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;

import javax.swing.JOptionPane;
    import java.util.Scanner;
/**
 *
 * @author Lenovo V14
 */
public class Latihan {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner (System.in);
        
//        System.out.println("====Program Penilaian Mahasiswa====");
//        System.out.print("Masukkan Nilai Mahasiswa : ");
//        double nilai = userInput.nextDouble();
//        
//        if (nilai >= 3.5 && nilai <= 4.0){
//            System.out.println("nilai A (SANGAT MEMUASKAN)");
//        } else if (nilai >= 3.0 && nilai <= 3.4){
//            System.out.println("nilai B (MEMUASKAN)");
//        } else if (nilai >= 2.5 && nilai <= 2.9){
//            System.out.println("nilai C (BAIK SEKALI");
//        } else if (nilai > 2.0 && nilai <= 2.4){
//            System.out.println("nilai D (BAIK)");
//        } else if (nilai <= 2.0){
//            System.out.println("nilai E (KURANG)");
//        }

//        System.out.println("====Program Hitung Nilai Akhir====");
//        System.out.print("Masukkan Nilai Tugas : ");
//        double ntugas = userInput.nextDouble();
//        System.out.print("Masukkan Nilai Quiz : ");
//        double nquiz = userInput.nextDouble();
//        System.out.print("Masukkan Nilai UAS : ");
//        double nuas = userInput.nextDouble();
//        
//        double nakhir;
//
//        if (nquiz > nuas){
//         nakhir = (0.4*nquiz)+(0.4*nuas)+(0.2*ntugas);
//            if (nakhir >= 85 && nakhir <= 100){
//                System.out.println("BOBOT : 4 (A : Sangat Baik)");
//            }else if (nakhir >= 75.0 && nakhir <= 84.0){
//                System.out.println("BOBOT : 3 (B : Baik)");
//            }else if (nakhir >= 65.0 && nakhir <= 74.0){
//                System.out.println("BOBOT : 2 (C : Cukup)");
//            }else if (nakhir >= 50.0 && nakhir <= 64.0){
//                System.out.println("BOBOT : 1 (D : Baik)");
//            }else if (nakhir >= 0.0 && nakhir <= 49.0){
//                System.out.println("BOBOT : 1 (E : Gagal)");
//            }
//        }else if (nuas > nquiz){
//            nakhir = (0.3*nquiz)+(0.5*nuas)+(0.2*ntugas);
//            if (nakhir >= 85.0 && nakhir <= 100.0){
//                System.out.println("BOBOT : 4 (A : Sangat Baik)");
//            }else if (nakhir >= 75.0 && nakhir <= 84.0){
//                System.out.println("BOBOT : 3 (B : Baik)");
//            }else if (nakhir >= 65.0 && nakhir <= 74.0){
//                System.out.println("BOBOT : 2 (C : Cukup)");
//            }else if (nakhir >= 50.0 && nakhir <= 64.0){
//                System.out.println("BOBOT : 1 (D : Baik)");
//            }else if (nakhir >= 0.0 && nakhir <= 49.0){
//                System.out.println("BOBOT : 1 (E : Gagal)");
//            }
//        }
        

//        System.out.println("Program Menentukan Nilai A,B,C,D dan E Sesuai Kontrak Kuliah UIN Suska Riau ");
//        System.out.println("15% Pribadi, 15% Quiz, 35% UTS, 35% UAS");
//
//        String quiz1 =  JOptionPane.showInputDialog("Masukkan Nilai Quiz 1 (1-100) : ");
//        String quiz2 =  JOptionPane.showInputDialog("Masukkan Nilai Quiz 2 (1-100) : ");
//        double nilaiquiz = (((Double.parseDouble(quiz1) + Double.parseDouble(quiz2))/2)*15)/100;
//
//        String uts =  JOptionPane.showInputDialog("Masukkan Nilai UTS (1-100) : ");
//        double nilaiuts = (Double.parseDouble(uts) * 35)/100;
//        String uas =  JOptionPane.showInputDialog("Masukkan Nilai UAS (1-100) : ");
//        double nilaiuas = (Double.parseDouble(uas)*35)/100;
//        String pribadi =  JOptionPane.showInputDialog("Masukkan Nilai Pribadi (1-100): ");
//        double nilaipribadi = (Double.parseDouble(pribadi) * 15)/100;
//
//        double nilaikeseluruhan = nilaiquiz + nilaiuas + nilaipribadi + nilaiuts;
//
//
//        if (nilaikeseluruhan >= 85){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah A ");
//        }else if(nilaikeseluruhan >=80 && nilaikeseluruhan <=84){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah A- ");
//        }else if(nilaikeseluruhan >=75 && nilaikeseluruhan <=79){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah B+ ");
//        }else if(nilaikeseluruhan >=70 && nilaikeseluruhan <=74){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah B ");
//        }else if(nilaikeseluruhan >=65 && nilaikeseluruhan <=69){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah B- ");
//        }else if(nilaikeseluruhan >=60 && nilaikeseluruhan <=64){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah C+ ");
//        }else if(nilaikeseluruhan >=55 && nilaikeseluruhan <=59){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah C ");
//        }else if(nilaikeseluruhan >=50 && nilaikeseluruhan <=54){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah C- ");
//        }else if(nilaikeseluruhan >=40 && nilaikeseluruhan <=50){
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah D ");
//        }else {
//            JOptionPane.showMessageDialog(null,"Nilai Keseluruhan: " + nilaikeseluruhan + " dan Nilai adalah E ");
//        }


           // Percobaan 2
           
    }
}
