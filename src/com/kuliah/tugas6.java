/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;

import javax.swing.JOptionPane;

public class tugas6 {
    public static void main(String[] args) {
        // 1
        //Array Statis
        int data[]={20,10,50,30,10};
        System.out.print("Isi data anda adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ ", ");
        } System.out.println("");
        
//        //Array Dinamis Bil.Random
//        double contoh[] = new double[30];
//        for (int i = 0; i < 30; i++) 
//            contoh [i] = 100.0 * Math.random();
//            double rata = 0.0;
//            for (int i = 0; i < 10; i++) 
//                rata += contoh[i];
//                rata /= 30;
//                System.out.println("Mean 30 bilangna random : "+rata);
//                
//        // Array Dinamis Elemen Dimasukkan
//        int data[]= new int [10];
//        for (int a = 0; a < data.length; a++) {
//            data [a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Elemen Index ke "+a));
//            System.out.println("Index ke-"+a+" adaalah : "+data[a]);
//        }


//        //2
//        int data[]= new int [10];
//        int jumlah = 0;
//        double rata = 0.0;
//        
//        for (int a = 0; a < data.length; a++) {
//            data [a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Elemen Index ke "+a));
//            System.out.println("Index ke-"+a+" adaalah : "+data[a]);
//            jumlah += data[a];
//        }
//        
//        // (Menampilkan nilai Max dan Min)
//        int nmax = data[0];
//        int nmin = data[0];
//        int i_max = 0, i_min = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] > nmax){
//                nmax = data[i];
//                i_max = i;
//            } else if (data[i] < nmin){
//                nmin = data[i];
//                i_min = i;
//            }
//        }
////        
//        System.out.println("====================");
//        System.out.println("Nilai Maximum : "+nmax+ ", Di Index ke-"+i_max);
//        System.out.println("Nilai Minimum : "+nmin+ ", Di Index ke-"+i_min);
//        
//        // (Menghitung rata-rata)
//        rata = (double)jumlah/data.length;
//        System.out.println("Rata-rata dari Array Tersebut ialah : "+rata);
//        System.out.println("====================");
//        
//        // (Mengganti nilai)
//            int i = 0;
//            
//            int input1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Element yang dipilih dan ingin Diubah : "));
//            for (int index = 0; index < data.length; index++) {
//                if (data [index] == input1){
//                JOptionPane.showMessageDialog(null, "Angka : "+input1+" berada pada index ke : "+index);
//               }
//           }
//           int input2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Terbaru :"));
//           for (i = 0; i < data.length; i++){
//               if (data [i] == input1){
//                data[i] = input2;
//               }
//               System.out.println("Index ke-"+i+" adaalah : "+data[i]);
//           }

//         //3
//         double jumlah = 0.0;
//         int panjang = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Panjang Array yang di Inginkan : "));
//         int array[] = new int [panjang];
//         
//         // (Memasukkan Nilai Elemen dan Menampilkan Array nya)
//         for (int i = 0; i < array.length; i++) {
//            int index = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Nilai di Index ke - "+i));
//            array[i] = index;
//        }
//         for (int i = 0; i < array.length; i++) {
//             System.out.println("Nilai Index ke-"+i+", adalah "+array[i]);
//        }
//         
//         // (Menampilkan Nilai Terbesar dan terkecil)
//         int nmax = array[0];
//         int nmin = array[0];
//         int imax = 0, imin = 0;
//         
//         for (int i = 0; i < array.length; i++) {
//            if (array[i]>nmax){
//            nmax = array[i];
//            imax = i;
//            }else if (array[i]<nmin){
//            nmin = array[i];
//            imin = i;
//            }
//        }
//         System.out.println("=================");
//         System.out.println("Nilai Maximum : "+nmax+ ", Di Index ke-"+imax);
//         System.out.println("Nilai Minimum : "+nmin+ ", Di Index ke-"+imin);
//         
//         // Menjumlahkan semua data Array dan Mencari rata-rata
//         for (int i = 0; i < array.length; i++) {
//            jumlah+=array[i];
//        }
//         double rata = (double)jumlah/array.length;
//         System.out.println("=================");
//         System.out.println("Jumlah Nilai di dalam Array adalah : "+jumlah);
//         System.out.println("Rata-rata : "+rata);
//         
//         // Menjumlahkan semua Elemen yang berindex ganjil
//         System.out.println("=================");
//         int jumlah2 = 0;
//         System.out.println("INDEX GANJIL");
//         for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0){
//                System.out.println("Index ke-"+i+" Bernilai : "+array[i]);
//                jumlah2 += array[i];
//            }
//        }
//             System.out.println("Jumlah : "+jumlah2);
//        
//        // Mengecek Hasil dari penjumlahan diatas apakah Genap / Ganjil
//        if (jumlah2 % 2 != 0){
//            System.out.println("Penjumlahan tersebut GANJIL");
//        } else {
//            System.out.println("Penjumlahan tersebut GENAP");
//        }
//        
//        // Mengurutkan Elemen
//        System.out.println("==================");
//         for(int b=1;b<panjang;b++){
//            for(int d=0;d<panjang-b;d++){
//                if(array[d] > array[d+1])
//                {
//                    int urut = array[d];
//                    array[d]=array[d+1];
//                    array[d+1] = urut;
//                }
//            }
//        }
//        System.out.println("Hasil Pengurutan Adalah ");
//        for(int i=0;i<panjang;i++)
//        {
//            System.out.print(" "+ array[i]);
//        }

        //Pendahulua Modul 7
            //ujicoba
//        String kelas[][] = {
//            {"Aka","1-A","4-B", "5-K"},
//            {"Ika","2-A","3-B"},  
//        };
//        
//        
//        System.out.println(angka.length);// jumlah element pada baris pertama
//        System.out.println(angka[0].length);// jumlah element pada baris kedua
//        System.out.println(kelas.length);// jumlah element baris 
//        System.out.println(kelas[0].length);// jumlah element kolom

//        //4
        int data2[][] = {
            {4,6,4,7,8,3,2,10},
            {4,6,4,2,8,8,2,10}
        }; 
        

//        System.out.println("=====DATA ARRAY=====");
//        System.out.print("Baris Satu : ");
//        for (int i = 0; i < data2[0].length; i++){
//            System.out.print(data2[0][i] + ",");
//        }
//        System.out.println("");
//        System.out.print("Baris Dua : ");
//        for (int i = 0; i < data2[1].length; i++) {
//            System.out.print(data2[1][i] + ",");
//        }
//        System.out.println("");
//        
//        int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Nilai Elemen :"));
//        for (int baris = 0; baris < data2.length; baris++) {
//            for (int kolom = 0; kolom < data2[0].length; kolom++) {
//                if (data2[baris][kolom] == input){
//                    JOptionPane.showMessageDialog(null,"Angka : "+input+ ", Berada pada Baris :"+baris+", Kolom : "+kolom);
//
//                }
//            }
//        }
        
        //5
//        // Menampilkan Data Array For
//        for (int baris = 0; baris < data2.length; baris++) {
//            for (int kolom = 0; kolom < data2[0].length; kolom++) {
//                System.out.print(data2[baris][kolom]+",");
//            }
//            System.out.println("");
//        }
        
         // Menampilkan Data Array While
//        int baris = 0;
//        while (baris < data2.length){
//            int kolom = 0;
//            while (kolom < data2[baris].length){
//            System.out.print(data2[baris][kolom]+",");
//            kolom++;
//            }
//            System.out.println("");
//         baris++;
//        }
        
//         // Menampilkan Data Array Do-While
//         int baris = 0;
//         do {
//         int kolom = 0;
//         do {
//             System.out.print(data2[baris][kolom]+",");
//             kolom++;
//         } while (kolom < data2[0].length);
//         baris++;
//             System.out.println("");
//         } while (baris < data2.length);


        //6
//        //Mencari rata2 
//        int jumlah1 = 0, jumlah2 = 0;
//        System.out.print("Baris Satu : \t: ");
//        for (int i = 0; i < data2[0].length; i++){
//            System.out.print(data2[0][i] + ",");
//            jumlah1 += data2[0][i];
//        }
//        System.out.println("");
//        System.out.print("Baris Dua  \t: ");
//        for (int i = 0; i < data2[1].length; i++) {
//            System.out.print(data2[1][i] + ",");
//            jumlah2 += data2[1][i];
//        }
//        System.out.println("");
//        double rata2 = (double)(jumlah1 + jumlah2)/(data2[0].length + data2[1].length);
//        
//        System.out.println("Rata - Rata Array tersebut ialah : "+rata2);
        
    }
}
