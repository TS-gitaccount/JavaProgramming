//write a program to print the concatination of firat and last character of the string

package String;

import java.util.Scanner;

public class ConcatingFirstLastCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println(str.charAt(0)+","+str.charAt(str.length()-1));
    }
}
