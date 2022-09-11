
package com.mycompany.banka;
//main fonksiyonumuz olsun

public class Banka {

    
    
    public static void main(String[] args) {
        
        Atm atm = new Atm();
        
        Hesapbilgi hesap1 = new Hesapbilgi(5000,"onur","123456");
        
        
        atm.calistir(hesap1);
        
        System.out.println("Programdan çıkılıyor...");
        
    }
}
