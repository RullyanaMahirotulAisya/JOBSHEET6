/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author WINDOWS 10
 */
public class Persergi {
    public static void main(String[] args) {
        BufferedReader data;
        data = new BufferedReader(new InputStreamReader(System.in));
            String x = " ";
            int hitungLuas=0;
            System.out.println("---Luas Persegi---");
            System.out.print("Masukan nilai sisi: ");
            
            try {
                x = data.readLine();
                int angka = Integer.parseInt(x);
                hitungLuas = angka * angka;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error");
            }
            System.out.println("Luas persegi dengan sisi " + x + "adalah" + hitungLuas);
            
            }
    }

