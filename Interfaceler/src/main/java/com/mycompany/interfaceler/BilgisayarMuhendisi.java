package com.mycompany.interfaceler;

public class BilgisayarMuhendisi implements IMuhendis{

    private boolean askerlik;
    private String not;

    public BilgisayarMuhendisi(boolean askerlik, String not) {
        this.askerlik = askerlik;
        this.not = not;
    }
    
    
    @Override
    public String askerlikDurumu(boolean askerlik) {
        
        if (askerlik) {

            return "Yapıldı";
        }
        else{
            return "Yapılmadı";
        }
        
        
    }

    @Override
    public String notOrtalaması(double ortalama) {

        return "Ortalama = " + ortalama; 
    }

    
    public void bilgiler(){
        
        System.out.println("Askerlik " + askerlikDurumu(askerlik));
        System.out.println("Ortalama " + not);
    }
    
    
}
