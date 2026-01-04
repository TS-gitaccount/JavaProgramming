package Patterns;

//2 3 4
//3 4 5
//4 5 6
import java.util.Scanner;
public class Pattern20{
    static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                    System.out.print(row+col+" ");

            }
            System.out.println();
        }
    }
}


