/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banka;

import java.util.Scanner;

public class Atm {
    
    public void calistir(Hesapbilgi hesap1){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz...");
        
        System.out.println("**************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("**************************");
        
        int girishakki = 3;
        
        while (true) {            
            if (login.login(hesap1)){
                System.out.println("Giriş Başarılı");
                break;
            }
            else{
                girishakki -= 1;
                System.out.println("Giriş başarısız kalan giriş hakkı =" + girishakki);
            }
            if (girishakki == 0){
                System.out.println("Giriş hakkınız bitti.");
                return;
            }
            
        
        }
        
        System.out.println("****************************");
        String islemler = "1.Bakiye görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için qya basın\n";
        
        System.out.println(islemler);
        System.out.println("****************************");
        
        
        while (true) {            
            System.out.println("İşlemi seçiniz.");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println(hesap1.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı girin.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı girin.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz işlem..");
            }
        }
        
                
    }

}
