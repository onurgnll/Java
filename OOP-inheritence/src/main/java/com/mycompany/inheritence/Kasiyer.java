/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritence;

/**
 *
 * @author Onur
 */
public class Kasiyer extends Calisanlar{

    public Kasiyer(String isim, int yas, int maas, int tcno) {
        super(isim, yas, maas, tcno);
    }
    
    public void barkodOku(){
        System.out.println("kasiyer Barkod okuyor");
    }
    
}
