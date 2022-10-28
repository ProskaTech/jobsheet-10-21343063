/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class latihan_3_a {
    public static void main(String[]args){
        latihan_3 informatika = new latihan_3();
        latihan_3 elektronika = new latihan_3();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama\t: "+informatika.nama);
        System.out.println("NIM\t: "+informatika.nim);
        System.out.println("Jurusan\t: "+informatika.jur);
        System.out.println("Status\t: "+informatika.univ);
        
        System.out.println("----------------------------------");
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama\t: "+elektronika.nama);
        System.out.println("NIM\t: "+elektronika.nim);
        System.out.println("Jurusan\t: "+elektronika.jur);
        System.out.println("Status\t: "+elektronika.univ);
        
        
        
    }
}
