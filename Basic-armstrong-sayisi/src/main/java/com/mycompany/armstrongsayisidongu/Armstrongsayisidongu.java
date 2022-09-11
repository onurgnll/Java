package com.mycompany.armstrongsayisidongu;

import java.util.Scanner;

public class Armstrongsayisidongu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir x Sayisi giriniz");
        int a = scanner.nextInt();
        int q = a;
        
        if ((a / 100) > 0){
            int b = (a % 10) * (a % 10) * (a % 10);
            a = a/10;
            int c = (a % 10) * (a % 10) * (a % 10);
            a = a/10;
            int d = a * a *a ;
            if (b+c+d == q){
                System.out.println((b+c+d)+ " Sayisi bir armstrong sayisidir.");
            }
            else{
                System.out.println(q +" Sayisi bir armstrong sayisi değildir.");
                
            }
        }
    }
}
