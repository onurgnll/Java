package com.mycompany.arraylar.linkedlist.train;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArraylarLinkedlistTrain {

    public static void gezilecekSehirlerListesi(LinkedList<String> gezilecek_sehirler){
        
        ListIterator<String> iterator = gezilecek_sehirler.listIterator();
        
        System.out.println("\nGezilecek Şehirler listesi >>");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
        
    }
    
    
    public static void gezilecekSehirEkle(LinkedList<String> gezilecek_sehirler, String yeniyer){
        
        ListIterator<String> iterator = gezilecek_sehirler.listIterator();
        
        System.out.println("Gezilecek Yer ekleniyor -> "+ yeniyer);
        while (iterator.hasNext()) {
            
            int sortnumb = iterator.next().compareTo(yeniyer);
            
            if (sortnumb == 0){
                System.out.println("Bu şehir zaten listede var.");
                return;
            }
            else if (sortnumb < 0){
                //
            }
            else if (sortnumb > 0){
                
                
                iterator.previous();
                iterator.add(yeniyer);
                
                return;
            }
        }
        iterator.add(yeniyer);
    }
    
    
        
    public static void gezileceksehirSil(LinkedList<String> gezilecek_yerler, String silinecek_sehir){
      
        gezilecek_yerler.remove(silinecek_sehir);
        System.out.println("Başarıyla silindi Yeni liste \n");
        gezilecekSehirlerListesi(gezilecek_yerler);
        
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> gezilecek_sehirler = new LinkedList<String>();
        
        
        gezilecek_sehirler.add("ankara");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gezilecek Şehirler programına hoşgeldin.");
        
        String islemler = "0. İşlemlere Bak\n"
                          + "1. Gezilecek Şehirler listesine bak\n"
                          + "2. Yeni gezilecek Şehir ekle\n"
                          + "3. Gezilecek Şehir sil.\n"
                          + "4. Çık";
        
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
        while (true){
            
            System.out.println("Yapmak istediğiniz işlemi giriniz.");
            String yapilacakislem = scanner.nextLine();
            
            
            if (yapilacakislem.equals("1")){
                gezilecekSehirlerListesi(gezilecek_sehirler);
            }
            else if (yapilacakislem.equals("2")){
                
                System.out.println("\nEklecenek Şehir adı giriniz..");
                
                String yeniyer = scanner.nextLine();
                
                gezilecekSehirEkle(gezilecek_sehirler, yeniyer);
                
                
            }
            else if (yapilacakislem.equals("3")){
                
                System.out.println("\nSilmek istediğiniz Şehir adını giriniz");
                
                String silinecek_sehir = scanner.nextLine();
                
                
                gezileceksehirSil(gezilecek_sehirler, silinecek_sehir);
                
            }
            else if (yapilacakislem.equals("4")){
                System.out.println("programdan çıkılıyor");
                return;
            }
            else if (yapilacakislem.equals("0")){
                System.out.println(islemler);
            }
            
            else{
                System.out.println("Geçersiz işlem girdiniz!");
            }
        
            
        }
        
    }
}
