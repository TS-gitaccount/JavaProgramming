//write a program to convert the given string to lowercase

package String;

public class toUpperCase {
    static void main(String[] args) {
        String s="HelLO";
        System.out.println(s.toLowerCase());//using method
        System.out.println(toLowercase(s));//without method
    }
    public static String toLowercase(String s){
        String res="";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                res += (char) (ch + 32);
            else
                res += ch;
        }
        return res;
    }
}
