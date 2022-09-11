package com.mycompany.arabahesaplama;

import java.util.Scanner;

public class Arabahesaplama {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Arabanın kilometrede kaç kuruş yaktığını giriniz. ");
        int yaktigi= scanner.nextInt();
                
        System.out.println("Kaç km yol yapacaksınız? ");
        int yol = scanner.nextInt();
        
        int tutar;
        
        tutar = (yaktigi* yol) / 100;
                
        System.out.println("Toplam harcanan tutar = " + tutar + "TL");
        
        
        
        
    }
}
