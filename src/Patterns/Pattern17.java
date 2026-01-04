package Patterns;

// A B C
// D E F
// G H I
import java.util.Scanner;
public class Pattern17 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch='A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

