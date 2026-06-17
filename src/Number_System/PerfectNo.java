// write a program to find given no is perfect no
// no == sum of common facter of no

package Number_System;

public class PerfectNo {
    static void main(String[] args) {
        int n=28;
        System.out.println(isPerfect(n));
    }

    private static String isPerfect(int n) {
        int sum=0;
        if(n>1){
            for (int i=1;i<=n/2;i++) {
                if (n%i==0) {
                    sum+=i;
                }
            }
        }
        if (sum==n) {
            return "perfect no";
        }
        return "not perfect no";
    }
}
