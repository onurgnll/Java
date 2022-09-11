package com.mycompany.abstractclasslar;

import java.util.Scanner;

public class AbstractClasslar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geometrik cisim prog. hoşgeldiniz");
        
        System.out.println("Hangisi için İşlem yapmak istiyorsunuz?");
        String cisimler = """
                          1.Eşkenar Üçgen
                          2.Kare
                          3.Daire
                          """;
        
        System.out.println(cisimler);
        
        String yapilacakislem = """
                                1. Alan hesapla
                                2. Çevre hesapla
                                """;
        
        int yapilacak = scanner.nextInt();
        scanner.nextLine();
        
        if (yapilacak == 1){
            System.out.println("Kenar uzunluğu giriniz");
            int kenar = scanner.nextInt();
            
            Ucgen ucgen = new Ucgen(kenar);
            
            System.out.println("Yapılacak işlemi seçiniz");
            System.out.println(yapilacakislem);
            int yapilacakislem2 = scanner.nextInt();
            
            if (yapilacakislem2 == 1 ){
                ucgen.alanHesapla();
            }
            
            else if (yapilacakislem2 == 2){
                ucgen.cevreHesapla();
            }
            
        }
        
    
    }
}
