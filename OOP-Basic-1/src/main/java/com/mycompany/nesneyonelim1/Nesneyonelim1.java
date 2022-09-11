
package com.mycompany.nesneyonelim1;

public class Nesneyonelim1 {

    public static void main(String[] args) {
        Araba wolkswagen = new Araba("Kırmızı",4);
        
        System.out.println(Araba.araba_sayisi);
        
        
        wolkswagen.setRenk("Kırmızı");
        
        System.out.println("bu arabanın rengidir. " + wolkswagen.getRenk());
        
        wolkswagen.setKapi(-5);
        
        System.out.println(wolkswagen.getKapi());
    }
}
