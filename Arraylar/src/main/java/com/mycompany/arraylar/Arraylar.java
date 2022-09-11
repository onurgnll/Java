package com.mycompany.arraylar;

import java.util.Scanner;

public class Arraylar {

    public static void arrayBastir(int[] dizi){
        
        for (int i =0; i < dizi.length; i++){
            
            System.out.println("Dizinin "+ i+1 +". Elemanı = " + dizi[i]);
            
        }
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        /*
        int[] dizi = new int[5]; //1. dizi tanımlama yolu
        
        int[] dizi2 = {1,25,61,32,84}; // 2. dizi tanımlama yolu
        */
  
        
        
        
        //DİZİYİ KLAVYEDEN ALMA
        Scanner scanner = new Scanner(System.in);
        
        int[] dizim = new int[10];
        
        for (int i =0 ; i < 10; i++){
            System.out.println("Dizinin " + (i+1) +". Elemanını giriniz");
            
            dizim[i] = scanner.nextInt();
            

        }
        
        arrayBastir(dizim);
        
        //DİZİYİ OKUTMA
        /*
        for (int i =0; i < dizim.length;i++){  //dizim.lenght dizinin uzunluğunu gösteren metottur.
            System.out.println("Dizinin "+ (i+1) + ". Elemanı = "+ dizim[i]);
        }
        
        
        
        
        //dizinin ortalamasını bulma;
        
        int toplam = 0;
        for (int i =0 ; i< dizim.length;i++){
            
            toplam += dizim[i];
            
        }
        System.out.println("Dizinin ortalaması = " + (double)toplam / dizim.length);
        */
        
        
    }
}
