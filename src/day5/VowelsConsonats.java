package day5;

public class VowelsConsonats {
    public static void solutiin(String s){
        s=s.toLowerCase();
        String vowels="aeiou";
        String decimals="0123456789";
        String specialChars="!@$%^()";

        int vowelsCount=0;
        int decimalCount=0;
        int consonetsCount=0;
        int specialCharsCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(vowels.contains(Character.toString(ch))){
            vowelsCount++;

           }else if(decimals.contains(Character.toString(ch))){
              decimalCount++;
           }else if(specialChars.contains(Character.toString(ch))){
            specialCharsCount++;
           }else{
            consonetsCount++;
           }
           System.out.println("Count of vowels: " + vowelsCount);
           System.out.println("Count of decimal: " + decimalCount);
           System.out.println("Count of specialChars: " + specialCharsCount);
           System.out.println("Count of consonet: " + consonetsCount);
         }

       }
    public static void main(String[] args) {
        String s="aeioustring123&#";
        solutiin(s);

    }
    
    
}
