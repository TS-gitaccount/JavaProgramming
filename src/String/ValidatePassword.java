//password should not contain space
//password should contain 1 digit(0-9)
//password length should be between 8-15 character
//password should contain 1 lowercase and 1 uppercase letter
//password should contain 1 special character(@,#,%,$,%,!)
package String;

import java.util.Scanner;

public class ValidatePassword {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String str = sc.nextLine();
        System.out.println(validatePassword(str));
    }
    public static String validatePassword(String str){
        if(str.length()<8 || str.length()>15){
            return "Invalid Password";
        }
        if(str.contains(" ")) {
            return "Invalid Password";
        }

        return "Valid Password";
    }
}
