/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_1_a {
    public static void main(String[]args){
        latihan_1 Honda = new latihan_1();
        Honda.merk = "civic";
        Honda.warna = "Hitam";
        Honda.tahunProduksi = 2020;
        
        System.out.println("Merek\t: "+ Honda.merk);
        System.out.println("Warna\t: "+Honda.warna);
        System.out.println("Tahun\t: "+Honda.tahunProduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
