/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition.araba;

/**
 *
 * @author Onur
 */
public class Sanziman {
    
    private String marka;
    private Vites vites;

    public Sanziman(String marka, Vites vites) {
        this.marka = marka;
        this.vites = vites;
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
     * @return the vites
     */
    public Vites getVites() {
        return vites;
    }

    /**
     * @param vites the vites to set
     */
    public void setVites(Vites vites) {
        this.vites = vites;
    }
    
    
    
    
}
