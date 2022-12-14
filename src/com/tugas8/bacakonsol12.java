/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8;

/**
 *
 * @author Lenovo V14
 */
public class bacakonsol12 {
    public static void main(String[] args) {
        inputconsole ic = new inputconsole ();
        System.out.print("data1 = ");
        int data1 =ic.readInt();
        
        System.out.print("data2 = ");
        int data2 = ic.readInt();
        
        int data3 = data1+data2;
        System.out.println("data1 + data2 = "+data3);
    }
}
