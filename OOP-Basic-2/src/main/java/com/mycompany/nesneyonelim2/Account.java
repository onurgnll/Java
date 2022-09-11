package com.mycompany.nesneyonelim2;

public class Account {
    
    private int hesapno = -1;
    private String isim = "Bilinmiyor";
    private int iban = -1;
    private String soyad = "Bilinmiyor";
    private int bakiye = -1;
    
    
    
    public int getBakiye(){
        return this.bakiye;
    }

    /**
     * @return the hesapno
     */
    public int getHesapno() {
        return hesapno;
    }

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(int hesapno) {
        this.hesapno = hesapno;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the iban
     */
    public int getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    public void setIban(int iban) {
        this.iban = iban;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    public void bilgiler(){
        System.out.println("İsim = " + isim);
        System.out.println("Soyad = " + soyad);
        System.out.println("Iban = " + iban);
        System.out.println("HesapNo = " + hesapno);
        System.out.println("Bakiye = "+ bakiye);
    }
    
}
