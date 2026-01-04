package Patterns;

// 1 1 1
// 2 2 2
// 3 3 3
import java.util.Scanner;
public class Pattern10 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){

                    System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}

