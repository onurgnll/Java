
package com.mycompany.banka;

import java.util.Scanner;

public class Login {
    
    public boolean login(Hesapbilgi hesap){
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        
        System.out.println("Kullanıcı adını giriniz");
        username = scanner.nextLine();
        System.out.println("Şifrenizi giriniz");
        password = scanner.nextLine();
        
        
        if (username.equals(hesap.getUsername()) && password.equals(hesap.getPassword())){
            return true;
        }
        
        else{
            return false;
        }
        
        
        
        
    }
    
    
    
}
