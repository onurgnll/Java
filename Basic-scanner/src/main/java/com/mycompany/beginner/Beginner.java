package com.mycompany.beginner;

import java.util.Scanner;

public class Beginner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int sayi1 = 5;
        
        int sayi2= 9;
        
        System.out.println(sayi1+sayi2);
        
        
        int a = scanner.nextInt();
        
        System.out.println("girilen sayi =" + a);
        */
        System.out.println("Programa hosgeldiniz. Başlamak için adımları takip ediniz.");
        
        System.out.println("İsminizi giriniz.");
        String isim = scanner.nextLine();
        
        System.out.println("Soyisiminizi Giriniz.");
        String soyad = scanner.nextLine();
        
        System.out.println("Yaşınızı giriniz");
        int yas = scanner.nextInt();
        
        System.out.println("Kilonuzu giriniz");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu giriniz");
        float boy = scanner.nextFloat();
        
        float vucutendeks;
        
        vucutendeks = kilo / (boy*boy);

        
        System.out.println("İsim " + isim);
        System.out.println("Soyİsim " + soyad);
        System.out.println("Yaş " + yas);
        System.out.println("VKE " + vucutendeks);
        
     
        
        
        
    }
}
