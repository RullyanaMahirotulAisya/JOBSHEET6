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
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        String main;
        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader (System.in);
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        // mengisi variabel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        String nama = br.readLine();
        // Tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        
    }
    
}
