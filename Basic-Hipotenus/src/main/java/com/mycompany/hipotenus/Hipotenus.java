
package com.mycompany.hipotenus;

import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("dik ucgenin kenarlarini giriniz.");
        int a = scanner.nextInt() ;
        int b = scanner.nextInt();
        double c;
        
        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs uzunluğu = " + c);       
    }
}
