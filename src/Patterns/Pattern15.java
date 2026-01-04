package Patterns;

// A A A
// B B B
// C C C
import java.util.Scanner;
public class Pattern15 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch='A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(ch +" ");
            }
            ch++;
            System.out.println();
        }
    }
}

