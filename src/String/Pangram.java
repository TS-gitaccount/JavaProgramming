
//Write a program to check if the given program is pangram or not

//A pangram is a sentence that includes every letter of the alphabet at least once.
package String;

import java.util.Locale;

public class Pangram {
    static void main(String[] args) {
        String s="The Quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));
        System.out.println(isPangram2(s));

    }
    public static String isPangram2(String str) {
        str=str.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(str.indexOf(ch)==-1)
                return "not pangram";
        }
        return "pangram";
    }

    public static String isPangram(String s){
        if(s.length()<26){
            return "Not Pangram";
        }
        s= s.toLowerCase();
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(s.contains(ch+""))
              count++;
        }
        if(count>=26)
              return "Pangram";
        return "Not Pangram";
    }
}
