package com.mycompany.ifelse;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int yas;
        
        System.out.println("Yaşınızı giriniz");
        yas = scanner.nextInt();
        
        if (yas >= 18){
            System.out.println("yaşınız ehliyet almaya uygun.");
            
        }
        
        else{
            System.out.println("18 Yaşın altında ehliyet alamazsınız.");
        }
        
        
        
        
    }
}
