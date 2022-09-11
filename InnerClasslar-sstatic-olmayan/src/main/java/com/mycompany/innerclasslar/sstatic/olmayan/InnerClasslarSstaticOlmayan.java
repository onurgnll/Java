package com.mycompany.innerclasslar.sstatic.olmayan;

public class InnerClasslarSstaticOlmayan {

    public static void main(String[] args) {
        
        //inner class class içinde class demektir problemler classında 3 adet class var yukarıda
        
        Problemler.Matematik karecevre = new Problemler().new Matematik();
        
        karecevre.cevreHesapla(5);
        
        Problemler.Matematik.Alan karealani = new Problemler().new Matematik().new Alan(); // böyle oluşturulur.
        
        karealani.kareAlaniHesapla(5);

        
        
        

        Problemler.Fizik gerilim = new Problemler().new Fizik();
        
        gerilim.gerilimHesapla(5, 8);
        
        
    }
}
