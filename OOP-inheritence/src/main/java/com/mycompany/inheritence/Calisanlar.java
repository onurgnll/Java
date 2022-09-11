package com.mycompany.inheritence;

public class Calisanlar { //en baş takım
    
    private String isim;
    private int yas;
    private int maas;
    private int tcno;

    public Calisanlar(String isim, int yas, int maas, int tcno) {
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.tcno = tcno;
    }

    
    public void zamVer(int tcno,int zammiktari){
        
        maas += zammiktari;
        System.out.println(tcno + "TCli çalışana " + zammiktari + " TL zam yapıldı.");
        
    }
    
    public void bilgiler(){
        System.out.println(tcno + " TC'li kişinin bilgileri ->");
        System.out.println("İsim = "+ isim);
        System.out.println("Yaş = " + yas);
        System.out.println("Maaş = "+ maas);
    
    
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
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the tcno
     */
    public int getTcno() {
        return tcno;
    }

    /**
     * @param tcno the tcno to set
     */
    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    
    

    
    
    
    
    
}
