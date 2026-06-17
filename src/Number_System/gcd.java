//write a program to find gcd of given no

package Number_System;

public class gcd {
    static void main(String[] args) {
        int n1=8;
        int n2=4;
        findGCD(n1,n2);
    }

    private static void findGCD(int n1, int n2) {
        while (n2!=0){
            int temp =n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println(n1);
    }
}
