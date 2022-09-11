package com.mycompany.stringler;

public class Stringler {

    public static void main(String[] args) {
        /*
        String a = "Onur Gönüllü";
        
        String b = "Gönüllü";
        
        System.out.println("Boyutu = "+ a.length());
        System.out.println("Boyutu = "+ b.length()); //boyu
        
        System.out.println(b.charAt(5)); // 5. indexteki harf
        
        System.out.println(b.indexOf("ü")); // ünün hangi indexte olduğu
        
        System.out.println(b.lastIndexOf("ü")); // son ünün hangisinde olduğu
        
        System.out.println("*********************");
        System.out.println("son eleman = "+ b.charAt(b.length()-1)); // son elemanı gösterir
        
        System.out.println("*********************");
        
        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
            
        }
        
        System.out.println("*********************");
        
        
        System.out.println(b.startsWith("Gö")); // Gö ile başlıyormu (boolean)
        
        System.out.println(b.endsWith("lü")); // lü ile mi bitiryor
        
        System.out.println("*********************");
        
        
        System.out.println(b.indexOf("a")); // a harfinin indeksi / a olmadığı için -1 dönüyor
        
        System.out.println(b.indexOf("l"));
        
        System.out.println("******************");
        
        
        System.out.println(b.toUpperCase()); //büyük harf 
        
        System.out.println(b.toLowerCase()); //küçük harf yap.
        
        
        String sayi = "1923";
        
        int qq = Integer.parseInt(sayi); // stringi integere dönüştürüyor..
       
        System.out.println(qq);
        
        
        
        String sayi2 = String.valueOf(qq); // integeri stringe dönüştürür....
        
        System.out.println(sayi2);
                
        */
        
        
        
        
        //STRİNGLER ARASI FARKKK
        
        String a1 = "Onur";
        String a2 = "Onur";
        
        if (a1== a2){
            System.out.println("Eşitler "); // referansını bellekteki yerini yani pointeri kontrol eder
        }
        
        if (a1.equals(a2)){
            System.out.println("Eşitler"); // İçeriğini kontrol eder
        }
        
        
        System.out.println("************************************");
        
        String b1 = new String("Onur");
        String b2 = new String("Onur"); // obje halinde oluşturduk
        
        if (b1== b2){
            System.out.println("1Eşitler "); // Aynı referansta çıkmadılar
        }
        
        if (b1.equals(b2)){
            System.out.println("2Eşitler"); // İçeriğini kontrol eder
        }
        
        
        
    }
}
