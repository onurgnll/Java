package com.mycompany.nesneyonelim1;

public class Araba {
    public static int araba_sayisi = 0;
    private String renk;
    private int kapi;

    public Araba(String renk, int kapi) {
        this.renk = renk;
        this.kapi = kapi;
        araba_sayisi++;
    }
    
    public void setRenk(String renk){
        this.renk = renk;
        
    }
    public String getRenk(){
        return this.renk;
    }

    /**
     * @return the kapi
     */
    public int getKapi() {
        return kapi;
    }

    /**
     * @param kapi the kapi to set
     */
    public void setKapi(int kapi) {
        this.kapi = kapi;
    }
    
    
}
