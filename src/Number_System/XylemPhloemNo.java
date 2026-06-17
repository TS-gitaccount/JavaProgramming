//write a program to find given no is  xylem or phloem

package Number_System;

public class XylemPhloemNo {
    public static void main(String[] args) {
        int n = 1256;
        System.out.println(findXylem(n));
    }

        public static String findXylem (int n) {
            int extsum = n % 10;
            int intSum = 0;
            n /= 10;
            while (n >= 10) {
                intSum += n % 10;
                n /= 10;
            }
            extsum += n;

            if (extsum == intSum)
                return "It is xylem Phleom no";
            else
                return "It is not xylem Phleom no";
        }
}
