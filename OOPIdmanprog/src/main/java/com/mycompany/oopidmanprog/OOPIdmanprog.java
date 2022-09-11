package com.mycompany.oopidmanprog;

import java.util.Scanner;

public class OOPIdmanprog {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman programına hoşgeldiniz");
        System.out.println("****************************");
        System.out.println("Bir idman programı oluşturun...");
        
        System.out.println("Yapılacak Şınav Sayısı = ?");
        int sinav_sayisi = scanner.nextInt();
        System.out.println("Yapılacak Mekik Sayısı = ?");
        int mekik_sayisi = scanner.nextInt();
        System.out.println("Yapılacak Barfix Sayısı = ?");
        int barfix_sayisi = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(sinav_sayisi, mekik_sayisi, barfix_sayisi);
        
        while( idman.idmanBittimi() == false ){
            System.out.println("Yapılacak Hareketi giriniz (Sinav,Barfix,Mekik)");
            String yapilanidman = scanner.nextLine();
            System.out.println("Bu hareketten kaç adet yapmak istediğinizi giriniz");
            int idman_sayisi = scanner.nextInt();
            scanner.nextLine();
            
            idman.idmanYapti(yapilanidman, idman_sayisi);
            
        }
        
        System.out.println("Tebrikler İdman programını tamamladınız");
    
    }
}
