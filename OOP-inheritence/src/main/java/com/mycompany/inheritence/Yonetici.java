/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritence;

/**
 *
 * @author Onur
 */
public class Yonetici extends Calisanlar {

    public Yonetici(String isim, int yas, int maas, int tcno) {
        super(isim, yas, maas, tcno);
    }
    
    
    public void zamYap(Calisanlar calisan1,int zammiktari){
        
        calisan1.setMaas(calisan1.getMaas()+zammiktari);
        System.out.println("Zam yapıldı calisanların yeni maaşı = "+ calisan1.getMaas());
    }
    
}
