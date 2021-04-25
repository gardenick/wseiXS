package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.myLib.Account;
import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Random;
import java.util.Scanner;
public class isPalindromed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("podaj tekst do sprawdzenia (0, jak Ci  sie znudzi): ");
            String tekst = scn.next();
            if(tekst.equals("0")) break;
            System.out.println("Tekst:" + tekst + " " + (StringFun.isPalindrome(tekst) ? "" : "nie ") + "jest palindromem ");
        }   while(true);
    }
}

