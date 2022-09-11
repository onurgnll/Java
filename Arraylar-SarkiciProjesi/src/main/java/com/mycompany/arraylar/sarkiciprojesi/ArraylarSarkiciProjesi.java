package com.mycompany.arraylar.sarkiciprojesi;

import java.util.ArrayList;
import java.util.Scanner;



public class ArraylarSarkiciProjesi {

    public static void main(String[] args) {
        ArrayList sarkicilar = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        
        String sarkicilarislem = "1. Şarkıcıları göster\n"
                                 + "2. Şarkıcı ekle\n"
                                 + "3. Şarkıcı sil\n"
                                 + "4. Şarkıcı ara\n"
                                 + "5. Uygulamadan Çık";
        
        System.out.println("Şarkıcı Uygulamasına Hoşgeldiniz");
        System.out.println(sarkicilarislem);
        
        while (true) {            
            System.out.println("Yapmak istediğiniz işlemi Seçiniz");
            String yapilacakislem = scanner.nextLine();
            if (yapilacakislem.equals("1")){
                System.out.println("\nŞarkıcı Listesi ->");
                for (int i= 0; i< sarkicilar.size(); i++){
                    System.out.println((i+1) + ". Şarkıcı = " + sarkicilar.get(i));
                }
            }
            
            else if (yapilacakislem.equals("2")){
                System.out.println("Eklemek istediğiniz Şarkıcı ismini giriniz.");
                String ekleneceksarkici = scanner.nextLine();
                sarkicilar.add(ekleneceksarkici);
            }
            else if (yapilacakislem.equals("3")){
                System.out.println("Silmek istediğiniz şarkıcı ismini giriniz");
                String silineceksarkici = scanner.nextLine();
                sarkicilar.remove(silineceksarkici);
                
            }
            else if (yapilacakislem.equals("4")){
                System.out.println("Aramak istediğiniz şarkıcı ismini giriniz");
                String aranacaksarkici = scanner.nextLine();
                System.out.println(aranacaksarkici + " isimli sanatçı " + (sarkicilar.indexOf(aranacaksarkici)+1) + ". pozisyonda");
            }
            else if (yapilacakislem.equals("5")){
                System.out.println("Programdan çıkılıyor...");
                return;
            }
            else{
                System.out.println("Geçersiz İşlem girdiniz");
                System.out.println(sarkicilarislem);
            }
            
        }
        
        
    }
}
