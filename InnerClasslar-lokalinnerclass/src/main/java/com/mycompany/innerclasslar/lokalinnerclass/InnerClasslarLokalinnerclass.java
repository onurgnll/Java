package com.mycompany.innerclasslar.lokalinnerclass;

public class InnerClasslarLokalinnerclass {

    public void bilmiyorum(){
        
        //Selamla qwe = new Selamla(); BAŞKA METHOD İÇİNDE KULLANILAMAZ
        
    }
    
    
    public static void main(String[] args) {
        
        // metodun içinde innerclass tanımlanırsa ona denir
                
                
        class Selamla{
                
            public void selamver(){
                
                System.out.println("Selamke");
                
            }
            
        }
        
        
        Selamla hi = new Selamla();
        
        hi.selamver();
              
        
        
    }
}
