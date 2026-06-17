//WAP to convert decimal number to Binary no

package Number_System;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number: ");

        int n = sc.nextInt();
        System.out.println(toBinary(n));
    }
        public static int toBinary(int n) {
            int Binary = 0, pow = 1;
            while (n > 0) {
                Binary += (n % 2) * pow;
                n /= 2;
                pow *= 10;
            }
            return Binary;
        }
}
