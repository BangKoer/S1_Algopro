/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8_1;

import java.awt.*;
import javax.swing.*;

public class coba {
    public static void main(String[] args) {
         JFrame form = new JFrame("Design");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(200,350);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setVisible(true);
        
        JLabel a1 = new JLabel("Masukkkan angka pertama : ");
        a1.setBounds(20,0,180,65);
        form.add(a1);
        
        JTextField text1 = new JTextField();
        text1.setBounds(40,45,120,25);
        form.add(text1);
        
        JLabel a2 = new JLabel("Masukkkan angka kedua : ");
        a2.setBounds(30,70,180,65);
        form.add(a2);
        
        JTextField text2 = new JTextField();
        text2.setBounds(40,115,120,25);
        form.add(text2);
        
        JLabel a3 = new JLabel("Masukkkan angka pertama");
        a3.setBounds(20,140,180,65);
        form.add(a3);
        
        JTextField text3 = new JTextField();
        text3.setBounds(40,185,120,25);
        form.add(text3);
        
        JButton plus = new JButton();
        plus.setText("+");
        plus.setBounds(30,220,45,25);
        form.add(plus);
        
        JButton min = new JButton();
        min.setText("-");
        min.setBounds(80,220,45,25);
        form.add(min);
        
        JButton bagi = new JButton();
        bagi.setText("/");
        bagi.setBounds(135,220,45,25);
        form.add(bagi);
        
        JButton kali = new JButton();
        kali.setText("*");
        kali.setBounds(80,255,45,25);
        form.add(kali);
        
        
        
        
    }
}
