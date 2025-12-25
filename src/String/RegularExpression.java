//Dot (.): Matches any single character except a newline.
//Asterisk (*): Matches zero or more occurrences of the preceding element.
//Plus (+): Matches one or more occurrences of the preceding element.
//Question Mark (?): Matches zero or one occurrence of the preceding element.
//Square Brackets ([ ]): Matches any one of the characters inside the brackets.
//Caret (^): Matches the start of a string.
//Dollar Sign ($): Matches the end of a string.
//Parentheses ( ): Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.

//password should not contain space
//password should contain 1 digit(0-9)
//password length should be between 8-15 character
//password should contain 1 lowercase and 1 uppercase letter
//password should contain 1 special character(@,#,%,$,%,!)
package String;

import java.util.Scanner;

public class RegularExpression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String str = sc.nextLine();
        System.out.println(validatePassword(str));
    }
    public static String validatePassword(String str){
        if(str.length()<8 || str.length()>15)
            return "Invalid Password length";
        if(str.contains(" "))
            return "Invalid Password: space not allowed";
        if(!str.matches(".*[a-z].*"))
            return "Invalid Password : include lowercase letters";
        if(!str.matches(".*[A-Z].*"))
            return "Invalid Password : include uppercase letters";
        if(!str.matches(".*[0-9].*"))
            return "Invalid Password  : include numbers";
        if(!str.matches(".*[@$#%&!].*"))
            return "Invalid Password : include special characters";
        return "Valid Password";
    }
}
