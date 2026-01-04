package Patterns;

// A B C
// A B C
// A B C
import java.util.Scanner;
public class Pattern16 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            char ch ='A';
            for(int col=1;col<=n;col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

