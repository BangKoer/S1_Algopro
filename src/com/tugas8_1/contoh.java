/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contoh extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10,10);
    
    contoh (){
    super("INI adalah Form");
    setLocation(200,300);
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }
    
    void tampilan (){
    getContentPane().add(nama);
    nama.append("Nama Anda");
    getContentPane().add(bt);
    getContentPane().add(txnama);
    txnama.setBackground(Color.LIGHT_GRAY);
    bt.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            txnama.append(nama.getSelectedText());
        }
    });
    getContentPane().setLayout(new FlowLayout());
    setVisible(true);
    }
    
    public static void main(String[] args){
    contoh f = new contoh();
    f.tampilan();
    }
    

}

