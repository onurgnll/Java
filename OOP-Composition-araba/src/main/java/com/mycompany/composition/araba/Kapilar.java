package com.mycompany.composition.araba;

public class Kapilar {
    private int kapi_sayisi;
    private String kapi_rengi;

    public Kapilar(int kapi_sayisi, String kapi_rengi) {
        this.kapi_sayisi = kapi_sayisi;
        this.kapi_rengi = kapi_rengi;
    }

    
    public void kapiyiKapat(){
        System.out.println("kapi kapandı.....");
    }
    
    /**
     * @return the kapi_sayisi
     */
    public int getKapi_sayisi() {
        return kapi_sayisi;
    }

    /**
     * @param kapi_sayisi the kapi_sayisi to set
     */
    public void setKapi_sayisi(int kapi_sayisi) {
        this.kapi_sayisi = kapi_sayisi;
    }

    /**
     * @return the kapi_rengi
     */
    public String getKapi_rengi() {
        return kapi_rengi;
    }

    /**
     * @param kapi_rengi the kapi_rengi to set
     */
    public void setKapi_rengi(String kapi_rengi) {
        this.kapi_rengi = kapi_rengi;
    }
    
    
    
}
