package com.mycompany.arraylar.linkedlistler;

import java.util.LinkedList;
import java.util.ListIterator;



public class ArraylarLinkedlistler {

    public static void linkedlistBastir(LinkedList<String> baskentler){
        //for (String s: baskentler){
        //    System.out.println(s);
        //}
        
        ListIterator<String> iterator = baskentler.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
        
        
    }
    
    public static void siraliEkle(LinkedList<String> baskentler,String newindex){
        ListIterator<String> iterator = baskentler.listIterator();
        
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(newindex);
            
            
            if (karsilastir > 0){
                iterator.previous();
                iterator.add(newindex);
                
                return;
            }
            else if (karsilastir == 0){
                System.out.println("Böle bi index zaten var");
                return;
                
            }
            
            else if (karsilastir< 0 ){
                //xd
            }
            
            
        }
        
        iterator.add(newindex);
        
    }
    
    
    
    
    public static void main(String[] args) {
        LinkedList<String> baskentler = new LinkedList<>();
        
        
        siraliEkle(baskentler,"Washington");
        siraliEkle(baskentler,"Berlin");
        siraliEkle(baskentler,"Amsterdam");
        siraliEkle(baskentler,"Moskova");
        
        linkedlistBastir(baskentler);
        
        /*for (int i = 0; i < baskentler.size() ; i++){
            System.out.println(baskentler.get(i));
        }
        
        System.out.println("*******************");*/
        
        
        
        
        
    }
}
