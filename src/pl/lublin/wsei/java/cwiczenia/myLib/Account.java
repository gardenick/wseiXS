package pl.lublin.wsei.java.cwiczenia.myLib;

public class Account {
    /*private String name;

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++) tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }*/

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";

    private static String translitRepl[] = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public static String translit(String arg) {
        String res = "";
        arg = arg.toLowerCase();
        for (int i = 0; i < arg.length(); i++) {
            int index = ukrAlphabet.indexOf(arg.charAt(i));
        if (index<0){res+=" ";}
        else
            res += translitRepl[ukrAlphabet.indexOf(arg.charAt(i))];
        }
        System.out.println(res);
        return res;

    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }*/
}
