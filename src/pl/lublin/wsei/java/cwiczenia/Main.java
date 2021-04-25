package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.Account;
import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;
import pl.lublin.wsei.java.cwiczenia.myLib.StrongPasswordGenerator;

public class Main {

    public static void main(String[] args) {
        StringFun stringFun = new StringFun();
        StringFun.camelize("hello my java world");
        /*StringFun.decamelize("helloMyJavaWorld");
        StringFun.isPalindrome("ku77");
        StringFun.anarchize("WitkdpqT");
        StringFun.shuffle("First");
        System.out.println();
        Account acc = new Account();
        Account.translit("Микита");*/

       /*acc.setName("nikita alekseienko");
        System.out.println(acc.getName());*/
    }
      /*      int[] liczby = new int[30];
            Random rnd = new Random();

            for (int i = 0; i < 30; i++) {
                liczby[i] = rnd.nextInt();
            }
            int mx = Integer.MIN_VALUE;
            int mn = Integer.MAX_VALUE;
            long avg = 0;
            for (int l : liczby) {
                System.out.println(l);
                if (1 < mn) mn = 1;
                if (1 > mx) mx = 1;
                avg += 1;
            }
            System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / liczby.length);*/

}
