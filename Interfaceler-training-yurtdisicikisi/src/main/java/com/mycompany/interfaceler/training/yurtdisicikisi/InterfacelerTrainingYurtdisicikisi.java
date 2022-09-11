package com.mycompany.interfaceler.training.yurtdisicikisi;

import java.util.Scanner;

public class InterfacelerTrainingYurtdisicikisi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] countries = {"England","Switzerland","USA","Russia"} ;
        Passanger passanger1 = new Passanger();
        
        boolean englandneedvisa = true;
        
        System.out.println("Yurtdışı çıkış programına hoşgeldiniz");
        System.out.println("---------------------------------------");
        System.out.println("Gidebileceğiniz ülkeler -> ");
        System.out.println("");
        for(int i = 0 ; i<countries.length; i++){
            System.out.println(countries[i]);
        }
        
        System.out.println("Yurtdışına gidebilmek için Pasaportunuz olmalı, Vergilerinizi ödemiş olmalısınız (1000TL), Cezanız olmamalı");
        
        passanger1.hasPassport();
        passanger1.anyGuilt();
        passanger1.paidTax();
        
        System.out.println("Kontroller Yapılıyor");
        
        if (passanger1.getGuilt()==false){
            
            if (passanger1.getHaspassport()==true){
                
                if(passanger1.getTax()==true){
                    
                    System.out.println("Yurt dışına çıkmaya hak kazandınız.");
                    System.out.println("Gitmek istediğiniz ülkeyi seçiniz");
                    String gidilecekulke = scanner.nextLine();
                    
        
                    if (gidilecekulke.equals("England")){
                        System.out.println("İngiltereye gidiliyor");

                    }
                    else if (gidilecekulke.equals("Switzerland")){
                        System.out.println("Switzerlanda gidiliyor..");
                    }
                    else if (gidilecekulke.equals("USA")){
                        System.out.println("Amerikaya gidiliyor");
                    }
                    else if (gidilecekulke.equals("Russia")){
                        System.out.println("Rusyaya gidiliyor.");
                    }
                    else{
                        System.out.println("Geçersiz ülke seçimi");
                        return;
                    }
                }
                else{
                    System.out.println("Verginizi Ödememişseniz Yurt Dışına çıkamazsınız.");
                }
                
            }
            else{
                System.out.println("Pasaportunuz yok ise yurt dışına çıkamazsınız.");
                
            }
            
        }
        else {
            System.out.println("Cezanız varken yurtdışına çıkamazsınız.");
        }
        
        
        
        
    }
}
