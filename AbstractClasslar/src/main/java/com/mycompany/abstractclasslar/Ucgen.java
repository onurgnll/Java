package com.mycompany.abstractclasslar;

import java.util.Scanner;

public class Ucgen extends Sekil{
    private int kenar_uzunlugu;
    
    
    Scanner scanner = new Scanner(System.in);
    
    

    
    
    
    public Ucgen(int kenar) {
        kenar_uzunlugu = kenar;
    }
    
    
    
    
    @Override
    void alanHesapla() {
        
        
        double alan= kenar_uzunlugu*(kenar_uzunlugu/2) * (Math.sqrt(3));
        
        System.out.println("Üçgenin alanı = " + alan);
      
    }

    @Override
    void cevreHesapla() {
        int cevre = kenar_uzunlugu * 3;
        System.out.println("Üçgenin çevresi = "+ cevre);
        
    }
    
    
    
}
