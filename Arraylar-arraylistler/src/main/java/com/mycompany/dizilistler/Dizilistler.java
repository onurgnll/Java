
package com.mycompany.dizilistler;

import java.util.ArrayList;

public class Dizilistler {

    public static void bastir(ArrayList arrayList){
        
        for (int i = 0; i < arrayList.size(); i++) {
            
            System.out.println(arrayList.get(i));
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("selam");
        arrayList.add("black");
        arrayList.add("white");
        arrayList.add("black");
        
        System.out.println("****************");
        for (int i =0 ; i< arrayList.size(); i++){
            
            System.out.println("Arraylistlin " + (i+1) + ". Elemanı = " + arrayList.get(i));
            
        }
        //arrayList.remove("Selam"); // Selam indexini siler
        //arrayList.remove(1); // 1. indextekini siler
        
        System.out.println("*******************");
        System.out.println(arrayList.indexOf("black"));
        System.out.println(arrayList.lastIndexOf("black"));
        
        
        System.out.println(arrayList.indexOf("Red"));
        
        System.out.println("*****************************");
        arrayList.set(0, "Red"); //0. indextekini red yapıyor
        System.out.println(arrayList.get(0));
        
        System.out.println("*******************************");
        System.out.println("Bastırma fonksiyonuna gidiyor");
        bastir(arrayList);
        
    }
}
