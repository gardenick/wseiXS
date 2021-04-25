package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class isCamelized {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Enter text for the test (spaces should be replaced with '_'), (0 to exit): ");
            String tekst = scn.next();
            if(tekst.equals("0")) break;
            System.out.println("Camelized text: " + " " + (StringFun.camelize(tekst)));
        }   while(true);
    }
}
