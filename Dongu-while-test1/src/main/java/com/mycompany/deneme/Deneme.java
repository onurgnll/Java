/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.deneme;

import java.util.Scanner;

/**
 *
 * @author Onur
 */
public class Deneme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        
        
        System.out.println("Atm makinesine hoşgeldiniz. Yapmak istediğiniz işlemi giriniz.");
        System.out.println("-> Bakiye ogrenme");
        System.out.println("-> Para Çekme");
        System.out.println("-> Para Yatırma");
        System.out.println("Q tuşu -> Çıkış");
        
        while (!"q".equals(a)){
            a = scanner.nextLine();
        }
    }
}
