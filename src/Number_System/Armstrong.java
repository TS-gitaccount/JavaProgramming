//write a program to find given no is  armstrong no

package Number_System;

public class Armstrong {
    static void main(String[] args) {
        int n = 153;
        System.out.println(armStrong(n));
    }
        public static String armStrong(int n){
            int count =0,temp = n, sum=0;
            while (n!=0) {
                n /= 10;
                count++;
            }
            n = temp;
            while (n>0) {
                int digit = n % 10;
                int pow = 1;
                for (int i = 1; i <= count; i++) {
                    pow *= digit;
                }
                sum += pow;
                n /= 10;
            }
            if (sum == temp) {
                return "Armstrong number";
            }
            return "not Armstrong number";
    }
}
