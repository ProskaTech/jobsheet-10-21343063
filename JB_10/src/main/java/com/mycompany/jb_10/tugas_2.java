/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_2 {
    String nama,semester;
    int nim,sks;
    double IP;
    
    tugas_2(String nama,String semester,int nim,double IP){
        this.nama = nama;
        this.IP = IP;
        this.semester = semester;
        this.nim = nim;
        
    }
    void hitung_sks(){
        if(this.IP >= 3.5){
            this.sks = 24;
        }
        else if(this.IP >=3.0){
            this.sks = 22;
        }
        else if(this.IP >=2.5){
            this.sks = 20;
        }
        else if(this.IP >=2.0){
            this.sks = 18;
        }
        else if(this.IP <2.0){
            this.sks = 15;
        }
    }
    void tampil(){
        System.out.println("Nama Mahasiswa\t: "+this.nama);
        System.out.println("NIM\t        : "+this.nim);
        System.out.println("Semester\t: "+this.semester);
        System.out.println("IP Semester ini\t: "+this.IP);
        System.out.println("Anda berhak mengontrak "+this.sks+" pada semester "+this.semester);
    }
    
    public static void main(String[]args){
        tugas_2 a = new tugas_2("Joni","V",12345,3.50);
        a.hitung_sks();
        a.tampil();
    }
}
