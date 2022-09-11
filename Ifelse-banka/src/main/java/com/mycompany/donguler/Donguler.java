
package com.mycompany.donguler;

import java.util.Scanner;

public class Donguler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int i;
        for (i=0; i<1000; i++){
            System.out.println("Annemi çok seviyorum.");
        }
        System.out.println("i şuanda " + i);
        while (i<1100){
            System.out.println("Babamı az seviyorum.");
            i++;
        }
*/
        
        String a = "";
        
        int bakiye = 0;
        
        System.out.println("Atm makinesine hoşgeldiniz. Yapmak istediğiniz işlemi giriniz.");
        System.out.println("-> Bakiye ogrenme");
        System.out.println("-> Para Çekme");
        System.out.println("-> Para Yatırma");
        System.out.println("Q tuşu -> Çıkış");
        
        while (!"q".equals(a)){
            a = scanner.nextLine();
            if ("Bakiye ogrenme".equals(a)){
                System.out.println("Bakiyeniz = " + bakiye);
            }
            else if ("Para cekme".equals(a)){
                int cekilecekpara = 0;
                System.out.println("Çekmek istediginiz miktari giriniz.");
                cekilecekpara = scanner.nextInt();
                if (bakiye >= cekilecekpara){
                    bakiye = bakiye - cekilecekpara;
                    System.out.println("Para çekildi yeni bakiyeniz = "+ bakiye);
                }
                else{
                    System.out.println("Para çekme başarısız bu kadar paranız yok.");
                }
            }
            else if ("Para yatirma".equals(a)){
                System.out.println("Yatirmak istediğiniz parayi giriniz.");
                int yatirilacakpara;
                yatirilacakpara = scanner.nextInt();
                bakiye = yatirilacakpara + bakiye;
                System.out.println("Para Yatirma başarılı şu anki bakiyeniz = "+ bakiye);
            }
        }
        
    }
}
