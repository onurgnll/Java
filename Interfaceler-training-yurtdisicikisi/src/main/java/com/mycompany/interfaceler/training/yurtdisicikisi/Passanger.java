package com.mycompany.interfaceler.training.yurtdisicikisi;

import java.util.Scanner;

public class Passanger implements Abroadrules{

    Scanner scanner = new Scanner(System.in);
    
    private boolean haspassport;
    private boolean guilt;
    private boolean tax;

    public boolean getHaspassport() {
        return haspassport;
    }

    public boolean getGuilt() {
        return guilt;
    }

    public boolean getTax() {
        return tax;
    }

    
    
    
    @Override
    public void hasPassport() {
        System.out.println("Pasaportunuz var mı? (y / n)");
        
        String hasspass = scanner.nextLine();
        
        if (hasspass.equals("y")){
            haspassport = true;
        }
        else{
            haspassport = false;
        }
        
    }

    @Override
    public void paidTax() {

        System.out.println("Verginizi ödeyin (20 TL) ->");
        
        int atax = scanner.nextInt();
        scanner.nextLine();    
        
        if (atax >= 20){
            tax = true;
        }
        else {
            tax = false;
        }
    
    
    }

    @Override
    public void anyGuilt() {

        System.out.println("Herhangi Cezanız Varmı ? (y / n)");
        
        String aguilt = scanner.nextLine();
        if (aguilt.equals("y")){
            guilt = true;
        }
        else{
            guilt = false;
        }
    }
    
    
    
}
