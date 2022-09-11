package com.mycompany.arraylar.linkedlist.train2.upper;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArraylarLinkedlistTrain2Upper {
    
    
    public static void duraklarıGoster(LinkedList<String> tramvay){
        
        ListIterator<String> iterator = tramvay.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
    }
    
    public static void durakTuru(LinkedList<String> tramvay){
        
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> iterator = tramvay.listIterator();
        
        if (!iterator.hasNext()){
            System.out.println("Herhangi bir işlem bulunmuyor.");
        }
        
        boolean giris = false;
        boolean ileri = true;
        
        
        while (!giris) {        
            
            System.out.println("Yapmak istediğiniz işlemi seçiniz -> ");
            String islem = scanner.nextLine();
            
            if (islem.equals("4")){
                return;
            }
            else if (islem.equals("1")){
                
                System.out.println("***************");
                duraklarıGoster(tramvay);
                System.out.println("***************");
            }
            else if (islem.equals("2")){
                if(ileri == false){
                    iterator.next();
                    ileri = true;
                }
                
                
                if(iterator.hasNext()){
                    System.out.println("Bir Sonraki durağa geldin şu an ki durak  = " + iterator.next());
                }
                else{
                    System.out.println("Son durağa geldin");
                }
            }
            else if (islem.equals("3")){
                if(ileri == true){
                    iterator.previous();
                    ileri = false;
                }
                if(iterator.hasPrevious()){
                    
                    System.out.println("Bir Önceki durağa geldin şu an ki durak  = " + iterator.previous());
                }
                else{
                    System.out.println("Son durağa geldin");
                }
            }
        
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<String> tramvay = new LinkedList<String>();
        
        
        tramvay.add("Türkiş");
        tramvay.add("Ömürevleri");
        tramvay.add("Çobanlı");
        tramvay.add("Atakent");
        
        
        String islemler = """
                          *************************
                          1. Durakları Görüntüle
                          2. Bir sonraki durağa git
                          3. Bir önceki durağa git
                          4. Çık
                          *************************
                          """;
        
        System.out.println(islemler);
        
        durakTuru(tramvay);
        
    }
}
