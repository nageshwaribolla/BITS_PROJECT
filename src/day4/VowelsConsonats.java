package day4;

public class VowelsConsonats {

    public static void solutiin(String s){
        s = s.toLowerCase();

        String vowels = "aeiou";
        int vowelsCount = 0, decimalCount = 0, consonantsCount = 0, specialCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                vowelsCount++;
            } else if (ch >= '0' && ch <= '9') {
                decimalCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Count of vowels: " + vowelsCount);
        System.out.println("Count of decimal: " + decimalCount);
        System.out.println("Count of specialChars: " + specialCount);
        System.out.println("Count of consonants: " + consonantsCount);
    }

    public static void main(String[] args) {
        String s = "aeioustring123&#";
        solutiin(s);
    }
}