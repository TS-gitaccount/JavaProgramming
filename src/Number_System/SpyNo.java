//write a program to find given no is  spy no
//sum of the digit == product of digit
package Number_System;

public class SpyNo {
    static void main(String[] args) {
        int n=123;
        System.out.println(isSpy(n));
    }

    private static String isSpy(int n) {
        int sum=0,prod=1;
       while(n>0){
           sum+=n%10;
           prod*=n%10;
           n=n/10;
       }
       if(sum==prod){
           return "Spy no";
       }
       return "Not Spy no";
    }
}
