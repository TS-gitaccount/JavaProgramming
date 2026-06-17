//write a program to find given no is  strong no

package Number_System;

public class StrongNo {
    public static void main(String[] args) {
        int n = 145;

        System.out.println(findStrong(n));
    }

    public static String findStrong (int n) {
        int Sum = 0, temp = n;
        while (temp > 0) {
            int ldigit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= ldigit; i++)
                fact *= i;
            Sum += fact;
            temp /= 10;
        }
        if (Sum == n)
            return "Strong number";
        else
            return "Not a Strong number";
    }

}
