
package com.mycompany.ifelsebuyuksayiyibulma;

import java.util.Scanner;

public class Ifelsebuyuksayiyibulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayilari giriniz");
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int buyuksayi = 0;
        
        if (a >= b && a >= c){
            buyuksayi = a;
        }
        else if (b >= a && b >= c){
            buyuksayi = b;
        }
        
        else if (c >= b && c >= a){
            buyuksayi = c;
        }
        
        System.out.println("En büyük sayi = "+ buyuksayi);
    }
}
