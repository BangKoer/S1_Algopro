/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alist_Mouse {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        final JLabel lb = new JLabel ("");
        final String [] items = {"roti","Madu"};
        final JComboBox comboBox = new JComboBox(items);
        JPanel pn = new JPanel();
        frame.add(pn,BorderLayout.WEST);
        pn.add(comboBox, BorderLayout.CENTER);
        pn.add(lb,BorderLayout.NORTH);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String mn = (String) comboBox.getSelectedItem();
                lb.setText(mn);
            }
        });
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
