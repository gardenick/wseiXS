package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class isDecamelized{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Enter text for the test (spaces should be replaced with '_'), (0 to exit): ");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Wynik metody decamelize: " + StringFun.decamelize(text));
        } while(true);
    }
}
