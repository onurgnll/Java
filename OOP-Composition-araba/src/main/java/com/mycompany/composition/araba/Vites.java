/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition.araba;

public class Vites {
    
    private int vites_sayisi;
    private String vites_türü;

    public Vites(int vites_sayisi, String vites_türü) {
        this.vites_sayisi = vites_sayisi;
        this.vites_türü = vites_türü;
    }

    public void vitesDegistir(){
        System.out.println("Vites degistirildi..");
    }
    
    public int getVites_sayisi() {
        return vites_sayisi;
    }

    public String getVites_türü() {
        return vites_türü;
    }

    /**
     * @param vites_sayisi the vites_sayisi to set
     */
    public void setVites_sayisi(int vites_sayisi) {
        this.vites_sayisi = vites_sayisi;
    }

    /**
     * @param vites_türü the vites_türü to set
     */
    public void setVites_türü(String vites_türü) {
        this.vites_türü = vites_türü;
    }
    
    
}
