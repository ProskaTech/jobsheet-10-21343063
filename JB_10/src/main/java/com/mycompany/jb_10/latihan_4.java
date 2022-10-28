/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class latihan_4 {
    String nama; 
    int umur;
    
    latihan_4(String n, int u){
        nama = n;
        umur = u;
    }
    void tampilAktor(){
        System.out.println("Namaku  : "+nama);
        System.out.println("Umurku  : "+umur+ " tahun");
    }
    public static void main(String args[]){
        latihan_4 a;
        
        a = new latihan_4 ("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("===================");
        
        a = new latihan_4("Messi",34);
        a.tampilAktor();
        System.out.println("===================");
     }
}
