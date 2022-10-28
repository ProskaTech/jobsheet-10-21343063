/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;
import java.util.Scanner;
/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_2 {
    String nama, tempat_lahir, tg_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan tempat lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan tanggal lahir\t: ");
        tg_lahir = input.nextLine();
        System.out.print("Masukkan berat badan\t: ");
        berat_badan = input.nextInt();
        System.out.print("Masukkan tinggi badan\t: ");
        tinggi_badan = input.nextInt();
    }
    public void identitas(){
        System.out.println("Nama saya\t: "+nama);
        System.out.println("Tempat Lahir\t: "+tempat_lahir);
        System.out.println("Tanggal Lahir\t: "+tg_lahir);
        System.out.println("Berat Badan\t: "+berat_badan+ " kg");
        System.out.println("Tinggi Badan\t: "+tinggi_badan+ " cm");
    }
    public static void main (String[] args){
        latihan_2 A = new latihan_2();
        A.inputData();
        A.identitas();
    }
}
