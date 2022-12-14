/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.PreparedStatement;

public class database {
     JFrame frame;
     JLabel nim,nama,kelas,matkul;
     JTextField txnim,txnama;
     JButton cari,simpan,edit,hapus,keluar;
     JRadioButton a,b,c;
     final JComboBox cbMatkul;
     ButtonGroup grup = new ButtonGroup();
     
     public database(){
         frame = new JFrame ("Lembar Penilaian");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(588,270);
         frame.setLocation(500, 450);
         frame.setLayout(null);
         frame.setVisible(true);
         
         nim = new JLabel ("NIM");
         nim.setFont(new Font("Dialog",1,15));
         nim.setBounds(25, 18, 50, 20);
         frame.add(nim);
         
         nama = new JLabel ("NAMA");
         nama.setFont(new Font("Dialog",1,15));
         nama.setBounds(25, 55, 50, 20);
         frame.add(nama);
         
         kelas = new JLabel ("KELAS");
         kelas.setFont(new Font("Dialog",1,15));
         kelas.setBounds(25, 94, 50, 20);
         frame.add(kelas);
         
         matkul = new JLabel ("MATKUL");
         matkul.setFont(new Font("Dialog",1,15));
         matkul.setBounds(25, 130, 90, 20);
         frame.add(matkul);
         
         txnim = new JTextField ();
         txnim.setBounds(120, 15, 240, 27);
         frame.add(txnim);
         
         txnama = new JTextField ();
         txnama.setBounds(120, 52, 420, 27);
         frame.add(txnama);
         
         
         a = new JRadioButton ("A");
         a.setFont(new Font("Dialog",1,15));
         a.setBounds(120, 94, 50, 20);
         frame.add(a);
         
         b = new JRadioButton ("B");
         b.setFont(new Font("Dialog",1,15));
         b.setBounds(170, 94, 50, 20);
         frame.add(b);
         
         c = new JRadioButton ("C");
         c.setFont(new Font("Dialog",1,15));
         c.setBounds(220, 94, 50, 20);
         frame.add(c);
         grup.add(a);
         grup.add(b);
         grup.add(c);
         
         final String items[] = {"Kalkulus","M.Diskrit","ITCS"};
         cbMatkul = new JComboBox(items);
         cbMatkul.setBounds(120, 130, 150, 30);
         frame.add(cbMatkul);
         
         cari = new JButton ("Cari");
         cari.setBounds(400, 15, 140, 27);
         frame.add(cari);
         
         edit = new JButton ("Edit");
         edit.setBounds(25, 170, 90, 35);
         frame.add(edit);
         
         simpan = new JButton ("Simpan");
         simpan.setBounds(115, 170, 90, 35);
         frame.add(simpan);
         
         hapus = new JButton ("hapus");
         hapus.setBounds(205, 170, 90, 35);
         frame.add(hapus);
         
         keluar = new JButton ("Keluar");
         keluar.setBounds(450, 170, 90, 35);
         frame.add(keluar);
     }
      void event(){
          a.setActionCommand("A");
          b.setActionCommand("B");
          c.setActionCommand("C");
          simpan.addMouseListener(new MouseAdapter (){
              public void mouseClicked(MouseEvent evt){
                    try {
                        PreparedStatement statement1 = koneksi.koneksiDB().prepareStatement
                         ("insert into penilaian values (?,?,?,?)");

                            statement1.setString(1, txnim.getText());
                            statement1.setString(2, txnama.getText());
                            statement1.setString(3, grup.getSelection().getActionCommand());
                            statement1.setString(4, cbMatkul.getSelectedItem().toString());
                            statement1.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Data telah disimpan");  
                        } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Data gagal disimpan");
                        }           
                    }
                });
              
      }   
         
         
         
     
     public static void main(String[] args) {
        database LP = new database();
        LP.event();
    }
}
          
          
          
          
          
          
      
      
      
      
      
