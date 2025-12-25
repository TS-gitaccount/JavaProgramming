//write a program to find the space count in the String
package String;

public class SpaceCount {
    static void main(String[] args) {
        String s = "abc    bc    sdf";
        System.out.println(spaceCount(s));
    }
    public static String spaceCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return "Space count : " + count ;
    }
}
