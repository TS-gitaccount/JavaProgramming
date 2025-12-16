
//write a program to print the even index character of the string with comma as separator

package String;

public class EvenIndexCharacter {
    static void main(String[] args) {
        String str="Bangalore";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)%2==0) {
                System.out.print(str.charAt(i));
                if (i + 2 < str.length())
                    System.out.print(",");
            }
        }

    }
}
