package Patterns;

// 1 2 3
// 4 5 6
// 7 8 9
import java.util.Scanner;
public class Pattern12 {
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){

                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}

