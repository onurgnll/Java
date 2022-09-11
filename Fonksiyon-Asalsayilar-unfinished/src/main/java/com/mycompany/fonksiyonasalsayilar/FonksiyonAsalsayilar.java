package com.mycompany.fonksiyonasalsayilar;

public class FonksiyonAsalsayilar {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 1000; i++){
            if ( (i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0) && (i%11 != 0)&& (i%13 != 0)&& (i%17 != 0)&& (i%19 != 0)&& (i%23 != 0)&& (i%29 != 0)){
                System.out.println(i + "");
            }
        }
    }
}
