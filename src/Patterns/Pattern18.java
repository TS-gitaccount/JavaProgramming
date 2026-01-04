package Patterns;

// - * -
// * * *
// - * -
import java.util.Scanner;
public class Pattern18{
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if (row==n/2+1 ||col==n/2+1)
                  System.out.print("* ");
                else
                  System.out.print("- ");

            }
            System.out.println();
        }
    }
}


