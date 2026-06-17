//write a program to find given no is prime no

package Number_System;

public class Prime {
    static void main(String[] args) {
        int n=30;
        System.out.println(isPrime(n));
    }

    private static String isPrime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
