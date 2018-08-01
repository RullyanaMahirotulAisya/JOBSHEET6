/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5.rullyanamahirotulaisya;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class KalkulatorAritmatika {
   static float total = 0, bil1 = 1, bil2 = 1; //global
    
   public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       while(bil1 !=0 & bil2 !=0) {
       System.out.println("KalkulatorSederhana");
       System.out.println("1. Penjumlahan");
       System.out.println("2. Pengurangan");
       System.out.println("3. Perkalian");
       System.out.println("4. Pembagian");
        int pilihan = input.nextInt();
        
        
       }
   }
}
