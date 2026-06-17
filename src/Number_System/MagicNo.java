//write a program to find given no is  magic no

package Number_System;

public class MagicNo {
    static void main(String[] args) {
        int n = 19;

        System.out.println(find_Magic(n));
    }

    public static String find_Magic(int n) {
        while (true) {
            int sum = 0;
            while (n > 0) {
                int lastdigit = n % 10;
                sum += lastdigit;
                n /= 10;
            }
            n = sum;
            if (sum == 1)
                return " Magic Number";
            else if (sum < 10)
                return "Not a Magic Number";
        }
    }
}
