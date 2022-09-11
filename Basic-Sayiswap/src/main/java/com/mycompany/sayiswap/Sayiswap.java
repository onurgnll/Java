package com.mycompany.sayiswap;

import java.util.Scanner;

public class Sayiswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int a,b;
        
        int temp;
        
        System.out.println("Bir a sayisi giriniz.");
        a = scanner.nextInt();
        
        
        System.out.println("Bir b sayisi giriniz.");
        b = scanner.nextInt();
        
        System.out.println("girdiden önce a ve b sayisi sirasiyla " + a + b);
        
        System.out.println("girdi basladi.");
        
        temp = b;
        b = a;
        a = temp;
        
        System.out.println("a ve b sayilari islemden sonra " + a + b);
        
        
        
        
        
        
        
        
    }
}
