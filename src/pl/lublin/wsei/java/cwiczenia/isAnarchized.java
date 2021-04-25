package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class isAnarchized {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Anarchize test");
        do{
            System.out.println("Enter text for the test (spaces should be replaced with '_'), (0 to exit): ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.println("Anarchized text: " + StringFun.anarchize(text));
        } while(true);
    }
}