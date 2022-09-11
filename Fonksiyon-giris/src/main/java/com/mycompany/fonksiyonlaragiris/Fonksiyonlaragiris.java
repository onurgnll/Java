package com.mycompany.fonksiyonlaragiris;

public class Fonksiyonlaragiris {
    public static void selam(){
        System.out.println("Selam");
    }
    
    public static int toplama(int a,int b,int c){
        return a+b+c;
    }
    
    public static int carpma(int a,int b){
        int c = a*b;
        return c;
    }
    public static int carpma(int a, int b, int c){
        
        return a*b*c; // burda olduğu gibi fonksiyon 2 kez yazılabilir bir parametre fazla yazınca alttaki fonksiyona az yazınca üstteki fonksiyona iletilir. 
    }
    
    public static String yazidondur(String a, String b) {
        System.out.println("Yazı döndürülüyor " + a + b);
        
        return "Ben donduruldum";
    }
    
    public static void main(String[] args) {
        selam();
        System.out.println("toplam sonucu = " + toplama(5,4,5));
        
        System.out.println(carpma((toplama(5,4,5)),(toplama(5,4,5))) + " iki adet toplama isleminden gelen returnu \ncarpma islemine gönderir sonra gelen değeri bulur");
        System.out.println("");
        System.out.println("");
        System.out.println("ondan gelen returnu ona gönderiyor Sonuç = " + (carpma((toplama(5, 2, 1)), (toplama(2,2,2)))));
        
        System.out.println("mainden sonra  " + yazidondur("Cafer", " Dolu"));
        
    }
}
