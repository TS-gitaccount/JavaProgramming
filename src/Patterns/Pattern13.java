package Patterns;

// 1 0 1
// 1 0 1
// 1 0 1
import java.util.Scanner;
public class Pattern13 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col%2!=0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
