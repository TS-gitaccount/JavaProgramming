package Patterns;

// * * * * * * * * *
// - * - - - - - * -
// - - * - - - * - -
// - - - * - * - - -
// - - - - * - - - -

import java.util.Scanner;
public class Pattern28 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n+n-1;col++){
                if( row==col || row+col==n*2 ||row==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}


