//write a program to find given no is neon no
// no == sum of digit of the square no

package Number_System;

public class NeonNo {
    static void main(String[] args) {
        int n=9;
        System.out.println(findNeon(n));
    }

    private static String findNeon(int n) {
        int num=n*n,sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
       if(sum==n){
           return "Neon no";
       }
       return "Not Neon no";
    }
}
