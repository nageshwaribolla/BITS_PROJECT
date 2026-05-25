package day4;

public class AnagramString {
    public static void main(String[] args) {
        String s1="Hello";
        String rev="";
        for(int i=s1.length()-1;i>=0;i++){
            rev=rev+s1.charAt(i);
        }if(s1.equals(rev)){
            System.out.println("Anagram String");

        }else{
            System.out.println("not Angram String");
 
        }
    }   
}
