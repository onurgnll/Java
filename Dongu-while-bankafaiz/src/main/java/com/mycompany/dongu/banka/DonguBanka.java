
package com.mycompany.dongu.banka;

import java.util.Scanner;

public class DonguBanka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float anapara;
        float gecici = 0;
        int kacyil;
        int i = 0;
        
        System.out.println("Bankamıza hosgeldiniz onur bey");
        System.out.println("Bankamızın yıllık faiz oranı %6dır.");
        System.out.println("Ne kadar paranız var?");
        anapara = scanner.nextFloat();
        
        System.out.println("Paranızı kaç yıl boyunca yatırmak istersiniz.");
        kacyil = scanner.nextInt();
        
        while (i < kacyil){
            gecici = ((anapara * 106)/100) ;
            anapara = gecici;
            i++;
        }
        System.out.println(kacyil + " Yıl Sonra paranızın degeri" + (int)gecici + "TL olacaktır");
        
    }
}
