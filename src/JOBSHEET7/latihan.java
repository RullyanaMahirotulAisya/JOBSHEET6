/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET7;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class latihan {
    public static void main (String [] args) {
        String identitas = "Rullyana Mahirotul Aisya / XRPL5 / 38";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIF.. 2");
        if(a == 5)
            System.out.println("nilai a sama dengan 5");
        System.out.println("\nIF.. 3");
        if(a > 5) {
            System.out.println("isi variable a :"+ a);
            System.out.println("nilai a lebih dari 5");
        }
    }
}
