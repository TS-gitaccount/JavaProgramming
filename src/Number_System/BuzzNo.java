// write a program to check if  the given number is buzz number or not

//buzz no is the number which is divisible by 7 or endswith 7

package Number_System;

import java.util.Scanner;

public class BuzzNo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        System.out.println(isBuzz(num));
    }
    public static String isBuzz(int num) {
        if(num%7==0 || num%10==7)
            return "Given number is a buzz number";
        else
            return "Given number is not a buzz number";
    }
}
