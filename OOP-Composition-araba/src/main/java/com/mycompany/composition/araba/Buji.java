
package com.mycompany.composition.araba;

public class Buji {
    
    private int buji_sayisi;
    private String buji_yakiti;

    public Buji(int buji_sayisi, String buji_yakiti) {
        this.buji_sayisi = buji_sayisi;
        this.buji_yakiti = buji_yakiti;
    }

    
    public void bujiyiAtesle(){
        System.out.println("Buji ateşlendi.");
    }
    
    /**
     * @return the buji_sayisi
     */
    public int getBuji_sayisi() {
        return buji_sayisi;
    }

    /**
     * @param buji_sayisi the buji_sayisi to set
     */
    public void setBuji_sayisi(int buji_sayisi) {
        this.buji_sayisi = buji_sayisi;
    }

    /**
     * @return the buji_yakiti
     */
    public String getBuji_yakiti() {
        return buji_yakiti;
    }

    /**
     * @param buji_yakiti the buji_yakiti to set
     */
    public void setBuji_yakiti(String buji_yakiti) {
        this.buji_yakiti = buji_yakiti;
    }
    
    
    
    
}
