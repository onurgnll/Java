/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.composition.araba;

/**
 *
 * @author Onur
 */
public class CompositionAraba {

    public static void main(String[] args) {
        
        Teker teker = new Teker("bridgestone", "Mercedes jant", 19);
        
        Buji buji = new Buji(8, "mazot");
        
        Motor motor = new Motor("BMW Motors", "1600cc",8 ,buji);
        
        Vites vites = new Vites(6,"Manuel");
        
        Sanziman sanziman = new Sanziman("sanzimanmarkasi", vites);
        
        
        Kapilar kapilar = new Kapilar(4, "kırmızı");
        
        motor.getBuji().bujiyiAtesle();
        System.out.println(motor.getBuji().getBuji_sayisi());
        
        
        System.out.println(sanziman.getVites().getVites_sayisi());
        
        sanziman.getVites().vitesDegistir();
        
        sanziman.setMarka("qweqwr");
        
        System.out.println(sanziman.getMarka());
        
        
    }
}
