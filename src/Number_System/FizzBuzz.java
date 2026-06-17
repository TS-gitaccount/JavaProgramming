// write a program to check given no is fizzBuzz no
// fizz is divisible by 3
// buzz is divisible by 7
// fizzbuzz is divisible by both 3 and 7


package Number_System;

import java.util.Scanner;

public class FizzBuzz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println(isFizzBuzz(n));
    }
    static String isFizzBuzz(int n){
        if(n%3==0 || n%7==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%7==0){
            return "Buzz";
        }
        else {
            return "Not Fizz";
        }
    }
}
