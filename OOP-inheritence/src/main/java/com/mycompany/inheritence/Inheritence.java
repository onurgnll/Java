package com.mycompany.inheritence;

import java.util.Scanner;

public class Inheritence {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Kasiyer kasiyer = new Kasiyer("Onur", 21, 5000, 49957780);
        
        Yonetici yonetici = new Yonetici("ali", 55, 8000, 21905714);
        
        
        System.out.println("Çalışan sorgulama sistemine hoşgeldiniz");
        
        
        while (true) {            
            System.out.println("Yapılacak işlemi seçiniz");
            System.out.println("Kasiyer için 1e");
            System.out.println("Yönetici islemleri için 2ye basınız.");
            System.out.println("çıkmak için qya basınız.");
            String islem = scanner.nextLine();
            
            
            
            
            
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                while (true) {                    
                    
                 System.out.println("Kasiyere barkod okutmak için 1e basınız.");
                 System.out.println("Bir üst menüye dönmek için qya basınız.");
                  String islem1 = scanner.nextLine();
                  if (islem1.equals("1")){
                     kasiyer.barkodOku();
                 }
                  else if (islem1.equals("q")){
                        System.out.println("Bir üst menüye dönüldü...");
                        break;
                    }
                }
            }
            else if (islem.equals("2")){
                while (true) {            
                    System.out.println("işçilere zam yapmak için 1e basınız.");
                    System.out.println("Bir üst menüye dönmek için qya basınız.");
                    String islem2 = scanner.nextLine();
                    if (islem2.equals("1")){
                        System.out.println("Ne kadar zam yapmak istediğinizi giriniz");
                        int zammiktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(kasiyer, zammiktar);
                        System.out.println("işlem başarılı" + kasiyer.getIsim() + " isimli kasiyerin yeni maaşı = "+ kasiyer.getMaas());
                    }
                    else if (islem2.equals("2")){
                        yonetici.bilgiler();
                    }
                    else if (islem2.equals("q")){
                        System.out.println("Bir üst menüye dönüldü...");
                        break;
                    }
                }
            }
        }
    }
}
