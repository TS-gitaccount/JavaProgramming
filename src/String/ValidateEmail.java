package String;

import java.util.Scanner;

public class ValidateEmail {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address");
        String email = sc.nextLine();
        System.out.println(isValidEmail(email));
    }
    public static String isValidEmail(String email) {
       if(email.endsWith("@gmail.com")&&!email.contains(" ")){}
           if((email.matches(".*[a-z].*")&& (email.charAt(0)>='a' && email.charAt(0)<='z')))
               return "Valid Email";
           return "Invalid Email";
    }
}
