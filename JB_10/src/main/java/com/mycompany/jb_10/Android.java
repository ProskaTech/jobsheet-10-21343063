/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_10;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class Android {
    
    void nyala(){
        System.out.println("Android menyala");
    }
    void panggilan(){
        System.out.println("Kring Kring Kring, ada panggila masuk");
    }
    void sms(){
        System.out.println("Tenenoeeett, ada sms baru");
    }
    void shutdown(){
        System.out.println("Android dimatikan");
    }
    public static void main(String[]args){
        Android a;
        a = new Android();
        
        a.nyala();
        a.panggilan();
        a.sms();
        a.shutdown();
    }
}
