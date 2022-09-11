/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition.araba;

/**
 *
 * @author Onur
 */
public class Motor {
    
    private String marka;
    private String hacim;
    private int silindir_sayisi;
    private Buji buji;

    public Motor(String marka, String hacim, int silindir_sayisi, Buji buji) {
        this.marka = marka;
        this.hacim = hacim;
        this.silindir_sayisi = silindir_sayisi;
        this.buji = buji;
    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the hacim
     */
    public String getHacim() {
        return hacim;
    }

    /**
     * @param hacim the hacim to set
     */
    public void setHacim(String hacim) {
        this.hacim = hacim;
    }

    /**
     * @return the silindir_sayisi
     */
    public int getSilindir_sayisi() {
        return silindir_sayisi;
    }

    /**
     * @param silindir_sayisi the silindir_sayisi to set
     */
    public void setSilindir_sayisi(int silindir_sayisi) {
        this.silindir_sayisi = silindir_sayisi;
    }

    /**
     * @return the buji_sayisi
     */
    public Buji getBuji() {
        return buji;
    }

    /**
     * @param buji_sayisi the buji_sayisi to set
     */
    public void setBuji(Buji buji) {
        this.buji = buji;
    }
    
    
    
    
    
}
