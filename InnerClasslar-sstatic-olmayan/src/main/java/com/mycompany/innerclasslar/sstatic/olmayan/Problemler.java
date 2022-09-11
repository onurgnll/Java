/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclasslar.sstatic.olmayan;

public class Problemler {
    
    private String burda = "Burdayım";
    
    public class Matematik{
        
        
        public void cevreHesapla(int kenar){
            
            System.out.println("Kare Cevresi = " + kenar*4);
            
        }
        
        public class Alan{
            
            public void kareAlaniHesapla(int kenar){
                
                System.out.println("Kare alanı = " + kenar*kenar);
                System.out.println(burda);
                
                
                
            }
            
        }
       
    }
    
    public class Fizik{
        
        public void gerilimHesapla(int i,int r){
            
            System.out.println(" V = i . r = " +i * r);
        }
        
    }
    
}
