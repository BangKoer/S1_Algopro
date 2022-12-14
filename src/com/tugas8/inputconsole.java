/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas8;


    //Input Keyboard Dengan Pemanggilan Method dengan nilai kembalian (Fungsi) 
import java.io.*;
public class inputconsole {
    public static String readString(){
    BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
    String string = " ";
        try{
            string= bfr.readLine();
        }catch (IOException ex){
            System.out.print(ex);
        } return string;
    }
    public static int readInt(){
        return Integer.parseInt (readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
}
