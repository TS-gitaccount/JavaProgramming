//write a program to find given no is  happy no

package Number_System;

public class HappyNo {
    static void main(String[] args) {
        int n = 19;

        System.out.println(find_happy(n));
    }

    public static String find_happy(int n) {
        while (true) {
            int sum = 0;
            while (n > 0) {
                int lastdigit = n % 10;
                sum += lastdigit*lastdigit;
                n /= 10;
            }
            n = sum;
            if (sum == 1)
                return " Happy Number";
            else if (sum == 4)
                return "Not a Happy Number";
        }
    }
}
