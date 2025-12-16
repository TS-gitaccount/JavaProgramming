//write a program to print the concatination of firat and last character of the string


package String;

public class ConcatingFirstLastCharacter {
    static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str.charAt(0)+","+str.charAt(str.length()-1));
    }
}
