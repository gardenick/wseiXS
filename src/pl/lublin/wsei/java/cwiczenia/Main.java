package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.mylib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	Integer num1;
//        System.out.println("Dec: ");
//  num1 =  input.nextInt();
//        System.out.println("Hex: " + Integer.toHexString(num1) + "\nBin: " + Integer.toBinaryString(num1));

        Account acc = new Account();
        acc.setName("Nikita Alekseienko");
        System.out.println(acc.getName());
    }

}
