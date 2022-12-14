/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uts;

/**
 *
 * @author Lenovo V14
 */
public class no2 {
    public static void main(String[] args) {
                  System.out.println("\n=======================================");
          System.out.print("Berikut Ialah Urutan Bilangan : ");
          for (int i = 1; i <= 20; i++) {
              System.out.print(i+",");
        }System.out.println();
        System.out.print("Bilangan Ganjil : ");
        for (int i = 1; i <= 20; i++) {
            if(i%2 != 0){
                System.out.print(i+",");
            }
        }System.out.println("");
        System.out.print("Bilangan Genap : ");
        for (int i = 1; i <= 20; i++) {
            if(i%2 == 0){
                System.out.print(i+",");
            }
        }System.out.println("");
    }
}
