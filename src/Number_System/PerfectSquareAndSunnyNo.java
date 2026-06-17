//write a program to find given no is perfect square and sunny no

package Number_System;

public class PerfectSquareAndSunnyNo {
    static void main(String[] args) {
        int n = 3;
        System.out.println(check(n));
    }

    private static String check(int n) {
        int m=n+1;
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return "Perfect square no";
            }
            if (i * i == m) {
                return "Sunny no";
            }

        }
        return "none";
    }
}



