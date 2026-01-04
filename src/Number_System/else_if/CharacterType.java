// write a program to check if the given character is a
// digit or alphabet or special character
package Number_System.else_if;

import java.util.Scanner;

public class CharacterType {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(findType(ch));
    }
    public static String findType(char ch) {
        if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z')
            return "Given character is Alphabet";
        else if(ch>='0'&&ch<='9')
            return "Given character is Digit";
        else
            return "Given character is special character";
    }
}
