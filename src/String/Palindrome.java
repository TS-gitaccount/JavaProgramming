//write a program to check if the given string is palindrome

package String;

public class Palindrome {
  public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));
    }
    public static String isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        for(int i=start; i<=end; i++){
            if(s.charAt(i)!=s.charAt(end)){
                return "Not a palindrome";
            }
            start++;
            end--;
        }
        return "palindrome";
    }
}
