//write a program to find given no is palindrome

package Number_System;

public class Palindrome {
    static void main(String[] args) {
        int n=121;
        System.out.println(findPalindrome(n));
    }

    private static String findPalindrome(int n) {
        int rev=0,num=n;
        while (n > 0) {
            rev = (rev*10) +(n % 10);
            n/=10;
        }
        if (rev == num) {
            return "palindrome";
        }
        return "not palindrome";
    }
}
