
package com.mycompany.whilekullaniciadisifre;

import java.util.Scanner;

public class Whilekullaniciadisifre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girishakki = 3;
        
        String sys_acc = "Onur";
        String sys_pw = "123456a";
        
        String user_acc = "";
        String user_pw = "";
        
        System.out.println("Sisteme Hosgeldiniz Kullanıcı adı ve şifrenizi giriniz");
        
        while (true){
            System.out.println("Kullanıcı adı:");
            
            user_acc = scanner.nextLine();
            
            System.out.println("Şifre:");
            user_pw = scanner.nextLine();
            
            if (sys_acc.equals(user_acc) && sys_pw.equals(user_pw)){
                System.out.println("Giriş başarılı Hoşgeldiniz Onur Bey.");
                break;
              
            }
            else{
                if (girishakki > 0 ){
                    girishakki--;
                    System.out.println("Giriş Başarısız Kalan Hak = "+ girishakki);
                    
                }
                else{
                    System.out.println("Giriş hakkınız bitti sistem kilitleniyor");
                    break;
                }
            }    
        }
    }
}
