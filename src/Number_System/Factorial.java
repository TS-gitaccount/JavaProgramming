//write a program to find factorial of given no

package Number_System;

public class Factorial{
    static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
