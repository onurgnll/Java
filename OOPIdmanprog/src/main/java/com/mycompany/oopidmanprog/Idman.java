package com.mycompany.oopidmanprog;

public class Idman {
    
    private int sinav_sayisi;
    private int mekik_sayisi;
    private int barfix_sayisi;

    public Idman(int sinav_sayisi, int mekik_sayisi, int barfix_sayisi) {
        this.sinav_sayisi = sinav_sayisi;
        this.mekik_sayisi = mekik_sayisi;
        this.barfix_sayisi = barfix_sayisi;
        System.out.println("İdman programı oluşturuldu...");
    }
    
    
    public void idmanOlustur(int sinav_sayisi,int mekik_sayisi, int barfix_sayisi){
        this.sinav_sayisi = sinav_sayisi;
        this.mekik_sayisi = mekik_sayisi;
        this.barfix_sayisi = barfix_sayisi;
        
        System.out.println("İdman programı oluşturuldu...");
        
    }
    public void idmanYapti(String yapilanidman,int idman_sayisi){
        
        if (yapilanidman.equals("Sinav")){
            sinav_sayisi -= idman_sayisi;
            if (sinav_sayisi > 0){
                System.out.println(idman_sayisi + " Şınav çektiniz Kalan Şınav sayisi = "+ sinav_sayisi);
            }
            else{
                System.out.println("Tebrikler Şınav Hareketini bitirdiniz Yeni harekete geçebilirsin..");
            }
        }
        else if (yapilanidman.equals("Mekik")){
            mekik_sayisi -= idman_sayisi;
            if (mekik_sayisi > 0){
                System.out.println(idman_sayisi + " Mekik çektiniz Kalan Mekik sayisi = "+ mekik_sayisi);
            }
            else{
                System.out.println("Tebrikler Mekik Hareketini bitirdiniz Yeni harekete geçebilirsin..");
            }
        }
        else if (yapilanidman.equals("Barfix")){
            barfix_sayisi -= idman_sayisi;
            if (barfix_sayisi > 0){
                System.out.println(idman_sayisi + " Barfix çektiniz Kalan Barfix sayisi = "+ barfix_sayisi);
            }
            else{
                System.out.println("Tebrikler Barfix Hareketini bitirdiniz Yeni harekete geçebilirsin..");
            }
        }
        else{
            System.out.println("Geçersiz Hareket...");
        }
        
        
        
      
    }
    
    public boolean idmanBittimi(){
        if (sinav_sayisi < 1 && mekik_sayisi < 1 && barfix_sayisi < 1){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return the sinav_sayisi
     */
    public int getSinav_sayisi() {
        return sinav_sayisi;
    }

    /**
     * @param sinav_sayisi the sinav_sayisi to set
     */
    public void setSinav_sayisi(int sinav_sayisi) {
        this.sinav_sayisi = sinav_sayisi;
    }

    /**
     * @return the mekik_sayisi
     */
    public int getMekik_sayisi() {
        return mekik_sayisi;
    }

    /**
     * @param mekik_sayisi the mekik_sayisi to set
     */
    public void setMekik_sayisi(int mekik_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
    }

    /**
     * @return the barfix_sayisi
     */
    public int getBarfix_sayisi() {
        return barfix_sayisi;
    }

    /**
     * @param barfix_sayisi the barfix_sayisi to set
     */
    public void setBarfix_sayisi(int barfix_sayisi) {
        this.barfix_sayisi = barfix_sayisi;
    }
    
    
    
    
    
    
}
