/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class DataSiswa {

    private static String Absen;
    public static void main(String[] args) {
  // deklarasi variabel 
    String nama, alamat;
    int usia, absen;
    // membuat scanner baru
    Scanner keyboard = new Scanner(System.in);
    // Tampilkan output ke user
    System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
    System.out.print("Nama Siswa: ");
    // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
    nama = keyboard.next();
    // Tampilkan output lagi
    System.out.print("Alamat: ");
    //menggunakan scanner lagi
    alamat = keyboard.next();
    System.out.print("Absen: ");
    usia = keyboard.nextInt();
    System.out.print("Usia: ");
    absen = keyboard.nextInt();
    // Menampilkan apa yang sudah simpan du variabel
    System.out.println("-----------------");
    System.out.println("Nama Siswa: " + nama);
    System.out.println("Alamat: " + alamat);
    System.out.println("Absen: " + usia);
    System.out.println("Usia: " + absen + "tahun");
    
    
    }
}
