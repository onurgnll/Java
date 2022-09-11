package com.mycompany.ifelsehesapmakinesi;

import java.util.Scanner;

public class Ifelsehesapmakinesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sayiyi giriniz.");
        int sayi1 = scanner.nextInt();
        System.out.println("2. Sayiyi giriniz.");
        int sayi2 = scanner.nextInt();
            
        
        System.out.println("yapmak istediğiniz islemi seciniz");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. /");
        System.out.println("4. *");
        
        int islem = scanner.nextInt();
        
        if (islem == 1){
            
            int sonuc = sayi1 + sayi2;
            System.out.println("Sonuç = "+ sonuc);
        }
        
        else if (islem == 2){
            
            int sonuc = sayi1 - sayi2;
            System.out.println("Sonuç = "+ sonuc);
        }
        
        else if (islem == 3){
            
            double sonuc = sayi1 / sayi2;
            System.out.println("Sonuç = "+ sonuc);
        }
        else if (islem == 4){
            
            int sonuc = sayi1 * sayi2;
            System.out.println("Sonuç = "+ sonuc);
        }
        else {
            System.out.println("Geçersiz islem girdiniz");
        }
    }
}
