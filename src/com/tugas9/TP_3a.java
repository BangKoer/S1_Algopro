/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TP_3a {
    JFrame frame;
    JLabel lbAngka1, lbAngka2, lbAngka3;
    JTextField txAngka1, txAngka2, txAngka3;
    JButton btPlus, btMin, btKali, btBagi;
    public TP_3a (){
        frame = new JFrame("Design");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(210,350);
        frame.setLayout(null);
        frame.setVisible(true);
        
        lbAngka1 = new JLabel ("Masukkan Angka Pertama");
        lbAngka1.setBounds(20, 20, 180, 25);
        frame.add(lbAngka1);
        
        txAngka1 = new JTextField ();
        txAngka1.setBounds(40, 45, 120, 25);
        frame.add(txAngka1);
        
        lbAngka2 = new JLabel ("Masukkan Angka Kedua");
        lbAngka2.setBounds(23, 80, 180, 25);
        frame.add(lbAngka2);
        
        txAngka2 = new JTextField ();
        txAngka2.setBounds(40, 110, 120, 25);
        frame.add(txAngka2);
        
        lbAngka3 = new JLabel ("Hasil = Angka Ketiga");
        lbAngka3.setBounds(35, 140, 180, 25);
        frame.add(lbAngka3);
        
        txAngka3 = new JTextField ();
        txAngka3.setBounds(40, 170, 120, 25);
        frame.add(txAngka3);
        
        btPlus = new JButton();
        btPlus.setText("+");
        btPlus.setBounds(25,210,45,25);
        frame.add(btPlus);
        
        btMin = new JButton();
        btMin.setText("-");
        btMin.setBounds(75,210,45,25);
        frame.add(btMin);
        
        btKali = new JButton();
        btKali.setText("*");
        btKali.setBounds(125,210,45,25);
        frame.add(btKali);
        
        btBagi = new JButton();
        btBagi.setText("/");
        btBagi.setBounds(75,240,45,25);
        frame.add(btBagi);
    }
    
    void operasi (){
        btPlus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
             int a1, a2, a3;
             a1 = Integer.parseInt(txAngka1.getText());
             a2 = Integer.parseInt(txAngka2.getText());
             a3 = a1 + a2 ;
             txAngka3.setText(String.valueOf(a3));
            }
        });
        btMin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
             int a1, a2, a3;
             a1 = Integer.parseInt(txAngka1.getText());
             a2 = Integer.parseInt(txAngka2.getText());
             a3 = a1 - a2 ;
             txAngka3.setText(String.valueOf(a3));
            }
        });
        btKali.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
             int a1, a2, a3;
             a1 = Integer.parseInt(txAngka1.getText());
             a2 = Integer.parseInt(txAngka2.getText());
             a3 = a1 * a2 ;
             txAngka3.setText(String.valueOf(a3));
            }
        });
        btBagi.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
             double a1, a2, a3;
             a1 = Double.valueOf(txAngka1.getText());
             a2 = Double.valueOf(txAngka2.getText());
             a3 = a1 / a2 ;
             txAngka3.setText(String.valueOf(a3));
            }
        });
    }
    public static void main(String[] args) {
        TP_3a ZZ = new TP_3a();
        ZZ.operasi();
    }
}
