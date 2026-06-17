// write a program to find lcm of 2 no
package Number_System;

public class LCM {
    static void main(String[] args) {
        int n1=10;
        int n2=40;
        System.out.println(findLCM(n1,n2));
    }

    private static int findLCM(int n1, int n2) {
        int lcm=n1>n2?n1:n2;
        while (true){
            if(lcm%n1==0 && lcm%n2==0){
                return lcm;
            }
            lcm++;
        }
    }
}
