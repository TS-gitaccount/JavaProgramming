// write a program to check given character is alphabet digit special character

package Number_System;

public class CharacterCheck {

    public static void main(String[] args) {

        char ch = '1';
        System.out.println(check (ch));

    }

        public static String check (char ch){

            if (ch >= '0' && ch<= '9')
                return "Given character is digit";
            else
                if (( ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
                    return "Given character is alphabet";
                else
                    return" Given character is special character";

        }

}
