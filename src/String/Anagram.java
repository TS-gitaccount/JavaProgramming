
//Write a program to check if the given two string is Anagram or not

//An anagram of a string is another string that contains the same characters,
// only the order of characters can be different.

package String;

import java.util.Arrays;

public class Anagram {
    static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        System.out.println(findAnagram(str1,str2));//without using loop
        System.out.println(isAnagram(str1,str2));//using loop
    }

    // without using loops
    public static String findAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return "Not an Anagram";
        }
        else{
            char[] s1=str1.toCharArray();
            char[] s2=str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1,s2)){
                return "Anagram";
            }
            else{
                return "Not Anagram";
            }

        }
    }

    public static String isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "Not Anagram";
        }
        else {
            {
                char[] s1 = str1.toCharArray();
                char[] s2 = str2.toCharArray();
                Arrays.sort(s1);
                Arrays.sort(s2);
                for(int i=0;i<s1.length;i++){
                    if(s1[i]!=s2[i]){
                        return "Not Anagram";
                    }
                }
                return "Anagram";
            }
        }

    }
}
