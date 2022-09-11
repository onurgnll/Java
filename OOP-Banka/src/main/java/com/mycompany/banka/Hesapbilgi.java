/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banka;


public class Hesapbilgi {

    private int bakiye;
    private String username;
    private String password;
    
    public Hesapbilgi(int bakiye,String username,String password){
        this.bakiye = bakiye;
        this.username = username;
        this.password = password;
    }
           
    
    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = "+ bakiye);
        
    }
    public void paraCek(int tutar){
        if (bakiye - tutar < 0){
            System.out.println("Yeterli bakiyeniz yok");
        }
        else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz " + bakiye);
        }
        
    }
    
    
}
