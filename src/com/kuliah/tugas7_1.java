/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuliah;


public class tugas7_1 {
    //Tipe Tipe Method
        // Void
        String nama,makanan;
        void Kucing(){
        nama = "Necko";
        System.out.println("Nama Kucing Saya Adalah "+nama);
        }
        
        // Return
        int jumlah;
        int jumlah(){
        jumlah = 1+2;
        return jumlah;
        }
        
        //Static
        static void umur_kucing(){
            System.out.println("Umur Kucing saia 7 tahun");
        }
        
        //Contoh Method Rekursif
        static void urutderet(int nomor){
        if (nomor <= 8)//jika variable nomor krng dari 7 (batas perulangan)
            {
                System.out.println("Nomor yang akan tampil adalah : "+nomor);// Menampilkan nilai nomor
                urutderet(1+nomor);//menambah nilai 1 pada nomor untuk perulangan
            }
        }
        
    // Tipe Tipe Access
        //Public

        // Memanggil dari Tipe Method
        public static void main(String[] args) {
            //Void
        tugas7_1 Hewan = new tugas7_1();
        System.out.println("====== KUCING =======");
        Hewan.Kucing();
        
            //Return
        tugas7_1 data = new tugas7_1();
        System.out.println("Kucingku Berjumlah "+data.jumlah());
        
            //Static
            umur_kucing();
            System.out.println("");
            
        //Memanggil Contoh Method Rekursif
        System.out.println("================Contoh Rekursif===================");
        urutderet(1);
        
    }
}
        
