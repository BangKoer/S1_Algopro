/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Layout_kal {
    JFrame frame;
    JTextField input;
    JButton plus,min,kali,bagi,satu,dua,tiga,empat,lima,enam,tujuh,lapan,bilan,nol,C,samdeng;
    String bil; 
    double jumlah,bil1,bil2 ;
    int pilih ;
        
        
    public Layout_kal(){
        frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(263,350);
        frame.setLayout(null);
        frame.setVisible(true);
        
        input = new JTextField ();
        input.setBounds(10, 10, 225, 40);
        frame.add(input);
        
        satu = new JButton ("1");
        satu.setBounds(10, 60, 45, 45);
        frame.add(satu);
        
        dua = new JButton ("2");
        dua.setBounds(70, 60, 45, 45);
        frame.add(dua);
        
        tiga = new JButton ("3");
        tiga.setBounds(130, 60, 45, 45);
        frame.add(tiga);
        
        plus = new JButton ("+");
        plus.setBounds(190, 60, 45, 45);
        frame.add(plus);
        
        empat = new JButton ("4");
        empat.setBounds(10, 120, 45, 45);
        frame.add(empat);
        
        lima = new JButton ("5");
        lima.setBounds(70, 120, 45, 45);
        frame.add(lima);
        
        enam = new JButton ("6");
        enam.setBounds(130, 120, 45, 45);
        frame.add(enam);
        
        min = new JButton ("--");
        min.setBounds(190, 120, 45, 45);
        frame.add(min);
        
        tujuh = new JButton ("7");
        tujuh.setBounds(10, 180, 45, 45);
        frame.add(tujuh);
        
        lapan = new JButton ("8");
        lapan.setBounds(70, 180, 45, 45);
        frame.add(lapan);
        
        bilan = new JButton ("9");
        bilan.setBounds(130, 180, 45, 45);
        frame.add(bilan);
        
        kali = new JButton ("*");
        kali.setBounds(190, 180, 45, 45);
        frame.add(kali);
        
        nol = new JButton ("0");
        nol.setBounds(10, 240, 45, 45);
        frame.add(nol);
        
        C = new JButton ("C");
        C.setBounds(70, 240, 45, 45);
        frame.add(C);
        
        samdeng = new JButton ("=");
        samdeng.setBounds(130, 240, 45, 45);
        frame.add(samdeng);
        
        bagi = new JButton ("/");
        bagi.setBounds(190, 240, 45, 45);
        frame.add(bagi);
        
    }
    
    void inputN() {
        satu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "1";
             input.setText(bil);
            }
        });
        dua.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "2";
             input.setText(bil);
            }
        });
        tiga.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "3";
             input.setText(bil);
            }
        });
        empat.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "4";
             input.setText(bil);
            }
        });
        lima.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "5";
             input.setText(bil);
            }
        });
        enam.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "6";
             input.setText(bil);
            }
        });
        tujuh.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "7";
             input.setText(bil);
            }
        });
        lapan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "8";
             input.setText(bil);
            }
        });
        bilan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "9";
             input.setText(bil);
            }
        });
        nol.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil += "0";
             input.setText(bil);
            }
        });
        C.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            input.setText("");
            bil1 = 0.0;
            bil2 = 0.0;
            jumlah = 0.0;
            bil = "";
            }
        });
    }
    void operasi(){
        plus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil1 = Double.parseDouble(bil);
            input.setText("+");
            bil="";
            pilih=1;
            }
        });
        min.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil1 = Double.parseDouble(bil);
            input.setText("-");
            bil="";
            pilih=2;
            }
        });
        kali.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil1 = Double.parseDouble(bil);
            input.setText("*");
            bil="";
            pilih=3;
            }
        });
        bagi.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
            bil1 = Double.parseDouble(bil);
            input.setText("/");
            bil="";
            pilih=4;
            }
        });
        samdeng.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                switch(pilih){
            case 1:
                bil2 = Double.parseDouble(String.valueOf(input.getText()));
                jumlah = bil1+bil2;
                bil = Double.toString(jumlah);            
                break;
            case 2:
                bil2 =Double.parseDouble(String.valueOf(input.getText()));
                jumlah = bil1 - bil2;
                bil = Double.toString(jumlah);            
                break;
            case 3:
                bil2 = Double.parseDouble(String.valueOf(input.getText()));
                jumlah = bil1 * bil2;
                bil = Double.toString(jumlah);            
                break;
            case 4:
                bil2 = Double.parseDouble(String.valueOf(input.getText()));
                jumlah = bil1 / bil2;
                bil = Double.toString(jumlah);            
                break;            
                } 
            input.setText(bil);
                }; 
        });
    } 
    public static void main(String[] args) {
        Layout_kal zz = new Layout_kal();
        zz.inputN();
        zz.operasi();
    }
}
        
            
        
    
    
    
    
       
        
