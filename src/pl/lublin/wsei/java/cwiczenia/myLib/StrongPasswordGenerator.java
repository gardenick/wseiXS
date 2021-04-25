package pl.lublin.wsei.java.cwiczenia.myLib;

import java.util.Random;

public class StrongPasswordGenerator {
    private final String maleLiterki = "qwertyuiopasdfghjklzxcvbnm";
    private final String wielkieLiterki = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private final String znaczkiSpecjalne = "!@#$%&*()_+-=[]|,./?><";
    private final String cyferki = "1234567890";
    private int dlugosc;
    private boolean maleLitery;
    private boolean wielkieLitery;
    private boolean cyfry;
    private boolean znakiSpecjalne;


    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
    }

    public char[] generate() {
        char[] password = new char[dlugosc];

        Random random = new Random();
        String combinedChars = "";
        if (maleLitery == true) combinedChars += maleLiterki;
        if (wielkieLitery == true) combinedChars += wielkieLiterki;
        if (cyfry == true) combinedChars += cyferki;
        if (znakiSpecjalne == true) combinedChars += znaczkiSpecjalne;

        for (int i = 0; i < dlugosc; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public static void main(String[] args) {

        char[] pswd = new StrongPasswordGenerator(20, true, true, true, false).generate();
        System.out.println(pswd);
    }
}