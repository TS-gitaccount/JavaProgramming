//write a program to find fibonacci of given no

package Number_System;

public class Fibonacci {
    static void main(String[] args) {
       int n=5;
       fibo(n);
    }

    private static void fibo(int n) {
        int n1=0,n2=1,n3=0;
        for (int i=1;i<=n;i++) {
            System.out.println(n2 +" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
}
